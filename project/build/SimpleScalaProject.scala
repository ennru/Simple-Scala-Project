import sbt._
import de.element34.sbteclipsify._

class SimpleScalaProject(info: ProjectInfo) extends DefaultProject(info) with Eclipsify with IdeaProject
{
  override def libraryDependencies = Set(
    "org.scalatest" % "scalatest" % "1.2" % "test->default" withSources() withJavadoc(),
    "junit" % "junit" % "4.8.2" % "test->default" withSources() withJavadoc(),
    "org.scala-tools.testing" %% "specs" % "1.6.5" % "test->default" withSources()
  ) ++ super.libraryDependencies
	
}