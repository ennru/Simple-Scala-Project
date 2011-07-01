name := "Simple-Scala-Project"

version := "1.0"

scalaVersion := "2.9.0-1"

libraryDependencies ++= Seq(
	"junit" % "junit" % "4.8.2" % "test",
	"org.specs2" %% "specs2" % "1.4" % "test",
	"org.scalatest" % "scalatest_2.9.0" % "1.6.1" % "test"
)
