name := "spark_test"

version := "1.0"

scalaVersion := "2.10.4"

//Automatic Dependency Management

libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.1.0"

//add local dependency (Manual Dependency Management)
//http://www.scala-sbt.org/release/docs/Library-Management.html

unmanagedJars in Compile ++= {
    val base = baseDirectory.value
    val baseDirectories = (base / "lib") +++ (base)// / "b" / "lib") +++ (base / "libC")
    val customJars = (baseDirectories ** "*.jar")// +++ (base / "d" / "my.jar")
    customJars.classpath
}