// Scala version to use inside sbt
scalaVersion := "2.13.16"

Compile / paradoxProperties ++= Map(
  "snip.g8root.base_dir" -> "../../../../src/main/g8",
  "snip.g8src.base_dir" -> "../../../../src/main/g8/src/main/",
  "snip.g8srctest.base_dir" -> "../../../../src/main/g8/src/test/"
)

paradoxGroups := Map(
  "Buildtool" -> Seq("sbt", "Gradle", "Maven")
)
