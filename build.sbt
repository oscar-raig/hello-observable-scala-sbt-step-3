val derby = "com.netflix.rxjava" % "rxjava-scala" % "0.14.2"

lazy val commonSettings = Seq(
  organization := "com.example",
  version := "0.1.0",
  scalaVersion := "2.11.7"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "hello",
    libraryDependencies ++= Seq("io.reactivex" % "rxscala_2.11" % "0.24.1", "org.scalaj" %% "scalaj-http" % "1.1.4")
)

