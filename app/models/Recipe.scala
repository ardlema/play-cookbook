package models

import anorm.SqlParser._
import anorm._
import play.api.db._
import play.api.Play.current

case class Recipe(id: Long, title: String)

object Recipe {

  val recipes: List[Recipe]  = Nil

  def all() : List[Recipe] = DB.withConnection { implicit c =>
    SQL("select * from recipe").as(recipe *)
  }

  def create(title: String) {
    DB.withConnection { implicit c =>
      SQL("insert into recipe (title) values ({title})").on(
      'title -> title
    ).executeUpdate()
    }
  }

  def delete(id: Long) {
    DB.withConnection { implicit c =>
      SQL("delete from recipe where id = {id}").on(
        'id -> id
      ).executeUpdate()
    }
  }

  val recipe = {
    get[Long]("id") ~
      get[String]("title") map {
      case id~title => Recipe(id, title)
    }
  }

}
