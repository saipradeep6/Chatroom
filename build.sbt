import com.github.play2war.plugin._

name := """play-java-chatroom-example"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.11"

lazy val root = (project in file(".")).enablePlugins(PlayJava)
	.settings(Play2WarPlugin.play2WarSettings: _*)
  	.settings(Play2WarKeys.servletVersion := "3.1")

libraryDependencies += "org.webjars" % "flot" % "0.8.3"
libraryDependencies += "org.webjars" % "bootstrap" % "3.3.6"

libraryDependencies += javaWs
libraryDependencies += "org.asynchttpclient" % "async-http-client" % "2.0.31"

libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test

// Needed to make JUnit report the tests being run
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))