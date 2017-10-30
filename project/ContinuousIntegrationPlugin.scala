import sbt._
import sbt.Keys.version
import sbt.plugins.JvmPlugin

object ContinuousIntegrationPlugin extends AutoPlugin {

  /**
    * The plugins that need to be enabled before this plugin can be enabled.
    */
  override val requires: Plugins = JvmPlugin

  /**
    * All tasks and settings declared in this object will be automatically imported into every *.sbt
    * file.
    *
    * The object or val must be called `autoImport`
    */
  object autoImport {

    /**
      * Define a custom setting
      */
    val buildNumber: SettingKey[Option[String]] =
      SettingKey[Option[String]]("buildNumber", "Contains the CI build number if available")
  }
  import autoImport._

  /**
    * Define a command alias for validation. This can be used as a single command on your CI.
    */
  private val validate = addCommandAlias("validate", "; clean ; scalafmtTest ; compile ; test")

  /**
    * The project settings this AutoPlugin configures.
    *
    * @return settings applied to the project
    */
  override def projectSettings: Seq[Setting[_]] =
    Seq(
      buildNumber := sys.env.get("BUILD_NUMBER"),
      version := s"1.${buildNumber.value.getOrElse("0-SNAPSHOT")}"
    ) ++ validate

}
