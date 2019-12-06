name := "ImproveSkills"

version := "0.1"

scalaVersion := "2.12.10"

val sparkVersion = "2.4.4"
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-hive" % sparkVersion

val smileVersion = "2.0.0"

libraryDependencies += "com.github.haifengl" % "smile-core" % smileVersion
libraryDependencies += "com.github.haifengl" % "smile-plot" % smileVersion
libraryDependencies += "com.github.haifengl" % "smile-math" % smileVersion
libraryDependencies += "com.github.haifengl" %% "smile-scala" % smileVersion

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
