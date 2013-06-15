package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Redirect(routes.Application.recipes)
  }

  def recipes = TODO

  def newRecipe = TODO

  def deleteRecipe(recipeId: Long) = TODO

  
}