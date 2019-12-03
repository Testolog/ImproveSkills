name := "ImproveSkills"

version := "0.1"

scalaVersion := "2.12.10"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.4"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.4"
libraryDependencies += "org.apache.spark" %% "spark-hive" % "2.4.4"

libraryDependencies += "com.github.haifengl" % "smile-core" % "1.5.3"
libraryDependencies += "com.github.haifengl" % "smile-plot" % "1.5.3"
libraryDependencies += "com.github.haifengl" % "smile-math" % "1.5.3"
libraryDependencies += "com.github.haifengl" %% "smile-scala" % "1.5.3"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
