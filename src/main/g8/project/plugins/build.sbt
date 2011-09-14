libraryDependencies += "org.scala-tools.sbt" %% "sbt-android-plugin" % "0.5.3-SNAPSHOT"

resolvers += "Proguard plugin repo" at "http://siasia.github.com/maven2"

libraryDependencies <+= sbtVersion("com.github.siasia" %% "xsbt-proguard-plugin" % _)

