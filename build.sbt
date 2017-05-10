name := "akka-http-webserver"
organization := "com.example"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % "10.0.6"
)

enablePlugins(JavaAppPackaging, ContinuousIntegrationPlugin)

// docker configuration
dockerAlias := dockerAlias.value.copy(username = Some("muki"))
dockerExposedPorts := Seq(8080)

// application configuration
javaOptions in Universal ++= Seq(
  "-J-Xms1024m",
  "-J-Xmx2048m"
)
