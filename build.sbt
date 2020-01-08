import sbt.Keys._
import play.sbt.PlaySettings

//resolvers +=
  //"cql-java" at "http://maven.icm.edu.pl/artifactory/repo/
  //"cql-java" at "http://maven.indexdata.com)"
resolvers ++= Seq(
  "Typesafe" at "http://repo.typesafe.com/typesafe/releases/",
  "cql java" at "http://maven.indexdata.com"
)



lazy val root = (project in file("."))
  .enablePlugins(PlayService, PlayLayoutPlugin, Common)
  .settings(
    name := "oai-play",
    scalaVersion := "2.13.1",
    libraryDependencies ++= Seq(
      guice,
      "org.joda" % "joda-convert" % "2.2.1",
      "net.logstash.logback" % "logstash-logback-encoder" % "6.2",
      "io.lemonlabs" %% "scala-uri" % "1.5.1",
      "net.codingwell" %% "scala-guice" % "4.2.6",
      "org.apache.solr" % "solr-solrj" % "7.3.1",
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.10.1",
      "org.marc4j" % "marc4j" % "2.9.1",
      "org.z3950.zing" % "cql-java" % "1.12",
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
    ),
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    )
  )

lazy val gatlingVersion = "3.3.1"
lazy val gatling = (project in file("gatling"))
  .enablePlugins(GatlingPlugin)
  .settings(
    scalaVersion := "2.12.10",
    libraryDependencies ++= Seq(
      "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion % Test,
      "io.gatling" % "gatling-test-framework" % gatlingVersion % Test
    )
  )

// Documentation for this project:
//    sbt "project docs" "~ paradox"
//    open docs/target/paradox/site/index.html
lazy val docs = (project in file("docs")).enablePlugins(ParadoxPlugin).
  settings(
    scalaVersion := "2.13.1",
    paradoxProperties += ("download_url" -> "https://example.lightbend.com/v1/download/play-samples-play-scala-rest-api-example")
  )
