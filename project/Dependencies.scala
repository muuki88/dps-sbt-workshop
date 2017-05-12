import sbt._

object Dependencies {

  val akkaHttp: ModuleID = "com.typesafe.akka" %% "akka-http" % "10.0.6"
  val scalaTest: ModuleID = "org.scalatest" %% "scalatest" % "3.0.1" % Test
}
