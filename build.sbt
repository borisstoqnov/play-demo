name := """example-app"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

routesGenerator := InjectedRoutesGenerator

enablePlugins(DebianPlugin)
maintainer := "Bai Hui"
packageSummary := "My Bai Hui"
packageDescription := "Package"
