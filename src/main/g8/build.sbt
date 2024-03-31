// give the user a nice default project!
ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "3.4.1"

lazy val root = (project in file("."))
  .settings(
    name := "Scala.php template"
  )
  .enablePlugins(PhpPlugin)
