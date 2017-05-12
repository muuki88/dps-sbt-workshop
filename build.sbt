name := "akka-http-webserver"
organization := "com.example"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  Dependencies.akkaHttp,
  Dependencies.scalaTest
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
buildInfoOptions += BuildInfoOption.ToJson
