import sbt._

class SimpleScalaProject(info: ProjectInfo) extends DefaultProject(info)
{
  override def libraryDependencies = Set(
    "org.scalatest" % "scalatest" % "1.2" % "test->default",
    "org.scala-tools.testing" % "specs" % "1.6.2.2" % "test->default",
    "junit" % "junit" % "4.8.2" % "test->default",
    "org.scala-tools.testing" %% "specs" % "1.6.5" % "test->default"
  ) ++ super.libraryDependencies
	
}