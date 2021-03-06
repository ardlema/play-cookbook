import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "play-cookbook"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    "postgresql" % "postgresql" % "8.4-702.jdbc4",
    "net.vz.mongodb.jackson" %% "play-mongo-jackson-mapper" % "1.1.0",
    jdbc,
    anorm
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
