import sbt._

class ScaratraExampleProject(info: ProjectInfo) extends DefaultWebProject(info)
{
  val scalaToolsSnapshots = "Scala Tools Repository" at "http://nexus.scala-tools.org/content/repositories/snapshots/"
  val sonatypeNexusSnapshots = "Sonatype Nexus Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
  val sonatypeNexusReleases = "Sonatype Nexus Releases" at "https://oss.sonatype.org/content/repositories/releases"
  //val fuseSourceSnapshots = "FuseSource Snapshot Repository" at "http://repo.fusesource.com/nexus/content/repositories/snapshots"

  val scalate = "org.fusesource.scalate" % "scalate-core" % "1.2"
  val scalatra = "org.scalatra" %% "scalatra" % "2.0.0-SNAPSHOT"
  val scalatraScalate = "org.scalatra" %% "scalatra-scalate" % "2.0.0-SNAPSHOT"

  val jetty6 = "org.mortbay.jetty" % "jetty" % "6.1.22" % "test"
  val servletApi = "javax.servlet" % "servlet-api" % "2.5" % "provided"

}
