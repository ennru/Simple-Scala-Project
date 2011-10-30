name := "Simple-Scala-Project"

version := "1.0"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
	"junit" % "junit" % "4.8.2" % "test",
	"com.novocode" % "junit-interface" % "0.7" % "test",
	"org.specs2" %% "specs2" % "1.6" % "test",
	"org.scalatest" %% "scalatest" % "1.6.1" % "test"
)
