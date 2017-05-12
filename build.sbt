name := "akka-http-webserver"
organization := "com.example"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % "10.0.6",
  "org.scalatest" %% "scalatest" % "3.0.1" % Test
)

enablePlugins(JavaAppPackaging, ContinuousIntegrationPlugin, BuildInfoPlugin)

// docker configuration
dockerAlias := dockerAlias.value.copy(username = Some("muki"))
dockerExposedPorts := Seq(8080)

// application configuration
javaOptions in Universal ++= Seq(
  "-J-Xms1024m",
  "-J-Xmx2048m"
)

// build info
buildInfoPackage := "echo.build"
