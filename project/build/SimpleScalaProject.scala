import sbt._
import de.element34.sbteclipsify._

class SimpleScalaProject(info: ProjectInfo) extends DefaultProject(info) with Eclipsify with IdeaProject
{
  val snapshots = "snapshots" at "http://scala-tools.org/repo-snapshots"
  val releases  = "releases" at "http://scala-tools.org/repo-releases"

  val scalatest = "org.scalatest" % "scalatest" % "1.3" withSources() withJavadoc()
  val junitInterface = "com.novocode" % "junit-interface" % "0.5" % "test"
  // imported by junitInterface  val junit = "junit" % "junit" % "4.8.1" % "test->default" withSources()
 // val specs = "org.scala-tools.testing" %% "specs" % "1.6.7.2" % "test->default" withSources()

  val specs2 = "org.specs2" %% "specs2" % "1.3"  
  val scalaz = "org.specs2" %% "scalaz-core" % "6.0.RC2"
 
  def specs2Framework = new TestFramework("org.specs2.runner.SpecsFramework")
  override def testFrameworks = super.testFrameworks ++ Seq(specs2Framework)
	
}
