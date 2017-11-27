
name := "ImgClassifier" 
version := "0.1.0" 
scalaVersion := "2.11.8" 
resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/" 
scalacOptions ++= Seq( 
	"-deprecation", // Emit warning and location for usages of deprecated APIs. 
	"-feature", // Emit warning and location for usages of features that should be imported explicitly. 
	"-unchecked", // Enable additional warnings where generated code depends on assumptions. 
	"-Xfatal-warnings", // Fail the compilation if there are any warnings. 
	"-Xlint", // Enable recommended additional warnings. 
	"-Ywarn-adapted-args", // Warn if an argument list is modified to match the receiver. 
	"-Ywarn-dead-code", // Warn when dead code is identified. 
	"-Ywarn-inaccessible", // Warn about inaccessible types in method signatures. 
	"-Ywarn-nullary-override", // Warn when non-nullary overrides nullary, e.g. def foo() over def foo. 
	"-Ywarn-numeric-widen", // Warn when numerics are widened. 
	"-language:higherKinds" // Enable the use of higher kinds by default 
)
 libraryDependencies ++= Seq( // Testing 
	"org.scalatest" %% "scalatest" % "3.0.1" % "test" withSources() withJavadoc() 
	,"org.scalacheck" %% "scalacheck" % "1.13.4" % "test" withSources() withJavadoc() 
	,"org.mockito" % "mockito-all" % "1.10.19" withSources() // Logging 
	,"com.typesafe.scala-logging" %% "scala-logging" % "3.5.0" withSources() 
	,"ch.qos.logback" % "logback-classic" % "1.1.7" withSources() 
	,"com.typesafe.akka" %% "akka-actor" % "2.5.6" 
	,"com.typesafe.akka" %% "akka-testkit" % "2.5.6")
mainClass in assembly := Some("Main")
