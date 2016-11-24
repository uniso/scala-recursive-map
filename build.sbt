name := "scala-recursive-map"

version := "1.0"

scalaVersion := "2.12.0"

crossScalaVersions := Seq(
  "2.12.0",
  "2.11.8",
  "2.10.6"
)

libraryDependencies  ++= Seq( "org.scalatest" %% "scalatest" % "3.0.1" % "test")
