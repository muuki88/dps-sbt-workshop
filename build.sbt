name := "akka-http-webserver"
organization := "com.example"
version := s"1.${sys.env.getOrElse("BUILD_NUMBER", "0-SNAPSHOT")}"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % "10.0.6"
)

enablePlugins(JavaAppPackaging)
dockerAlias := dockerAlias.value.copy(username = Some("muki"))
dockerExposedPorts := Seq(8080)

javaOptions in Universal ++= Seq(
  "-J-Xms1024m",
  "-J-Xmx2048m"
)
