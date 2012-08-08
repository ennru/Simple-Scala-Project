name := "Simple-Scala-Project"

version := "1.0"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
	"junit" % "junit" % "4.10" % "test",
	"com.novocode" % "junit-interface" % "0.8" % "test",
	"org.specs2" %% "specs2" % "1.12" % "test",
	"org.scalatest" %% "scalatest" % "1.8" % "test"
)

// resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

// resolvers += "Typesafe Artifactory" at "http://repo.typesafe.com/typesafe"

