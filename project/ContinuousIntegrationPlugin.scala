import sbt._
import sbt.Keys.version
import sbt.plugins.JvmPlugin

object ContinuousIntegrationPlugin extends AutoPlugin {

  override def requires: Plugins = JvmPlugin

  private val validate = addCommandAlias("validate", "; clean ; compile ; test")

  override def projectSettings: Seq[Setting[_]] = Seq(
    version := s"1.${sys.env.getOrElse("BUILD_NUMBER", "0-SNAPSHOT")}"
  ) ++ validate

}