package models

case class Recipe(id: Long, title: String)

object Recipe {

  val recipes: List[Recipe]  = Nil

  def all() : List[Recipe] = Nil

  def create(label: String) {
  }

  def delete(id: Long) {}

}
