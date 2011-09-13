import sbt._

import Keys._
import AndroidKeys._

object General {
  val settings = Defaults.defaultSettings ++ Seq (
    name := "$name$",
    version := "0.1",
    scalaVersion := "$project_scala_version$",
    platformName in Android := "android-$api_level$"
  )

  lazy val fullAndroidSettings = 
    General.settings ++
    AndroidProject.androidSettings ++
    TypedResources.settings ++
    AndroidMarketPublish.settings ++ Seq (
      keyalias in Android := "change-me",
      libraryDependencies += "org.scalatest" %% "scalatest" % "1.6.1" % "test"
    )
}

object AndroidBuild extends Build {
  lazy val main = Project (
    "$name$",
    file("."),
    settings = General.fullAndroidSettings 
  )

  lazy val tests = Project (
    "tests",
    file("tests"),
    settings = General.settings ++ AndroidTest.androidSettings
  ) dependsOn main
}
