resolvers += "typesafe" at "http://repo.typesafe.com/typesafe/releases"

libraryDependencies <+= sbtVersion ("org.scala-sbt" % "scripted-plugin" % _)

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.2.5")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.5")

addSbtPlugin("com.gilt" % "sbt-dependency-graph-sugar" % "0.7.5")
