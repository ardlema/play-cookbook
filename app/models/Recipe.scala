package models

import net.vz.mongodb.jackson.{Id, ObjectId, JacksonDBCollection}
import play.modules.mongodb.jackson.MongoDB
import play.api.Play.current
import org.codehaus.jackson.annotate.{JsonCreator, JsonProperty}
import scala.collection.JavaConverters._
import reflect.BeanProperty


/*class Recipe(@ObjectId @Id val id: Long,
               @BeanProperty @JsonProperty("title") val title: String) {
  @ObjectId @Id def getId = id;
}*/



case class Recipe(@ObjectId @Id val id: String,
               @BeanProperty @JsonProperty("title") val title: String) {

  @ObjectId @Id def getId = id;
}

//case class Recipe(id: Long, title: String)


object Recipe {

  private lazy val db = MongoDB.collection("recipes", classOf[Recipe], classOf[String])

  val recipes: List[Recipe]  = Nil

  def all(): List[Recipe] = {
    val listOfRecipes = db.find().toArray
    listOfRecipes.asScala.toList
  }

  def create(title: String) {
    val recipe = Recipe("507f1f77bcf86cd799439011",title)
    db.save(recipe)
  }

  def delete(id: String) {

  }


}
