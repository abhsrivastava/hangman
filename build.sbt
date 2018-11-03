lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.7",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "hangman",
    libraryDependencies ++= Seq(
      "org.scalaz" %% "scalaz-zio" % "0.3.1"
    )
  )
