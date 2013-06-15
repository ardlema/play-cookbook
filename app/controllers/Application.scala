package controllers

import play.api.data._
import play.api.data.Forms._
import play.api.mvc._
import models.Recipe

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index(Recipe.all(), recipeForm))
  }

  def recipes = Action {
    Ok(views.html.index(Recipe.all(), recipeForm))
  }

  def newRecipe = Action {
    implicit request =>
      recipeForm.bindFromRequest.fold(
        errors => BadRequest(views.html.index(Recipe.all(), errors)),
        label => {
          Recipe.create(label)
          Redirect(routes.Application.recipes)
        }
      )
  }

  def deleteRecipe(id: Long) = Action {
    Recipe.delete(id)
    Redirect(routes.Application.recipes)
  }

  val recipeForm = Form(
    "title" -> nonEmptyText
  )
}