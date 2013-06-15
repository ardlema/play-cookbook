package models

case class Recipe(id: Long, title: String)

object Recipe {

  def all() : List[Recipe] = Nil

  def create(label: String) {}

  def delete(id: Long) {}

}
