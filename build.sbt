enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"
scalaVersion := "3.0.0"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.0.0"
libraryDependencies += "io.github.cquiroz" %%% "scala-java-time" % "2.3.0"

// Add support for the DOM in `run` and `test`
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
