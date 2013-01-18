import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

  val appName = "Yet Another Blog Engine"
  val appVersion = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "org.fusesource.scalate" % "scalate-core_2.9" % "1.6.1",
    "org.mockito" % "mockito-all" % "1.9.0",
    "se.radley" %% "play-plugins-salat" % "1.1"
  )

  val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
    resolvers += "sonatype" at "https://oss.sonatype.org/content/repositories/releases/"
  )

}
