ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "delivery-time-scala",
    idePackagePrefix := Some("com.dt.delivery")
  )
