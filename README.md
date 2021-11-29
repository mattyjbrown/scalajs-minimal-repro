# Reproducing a ScalaJS 1.7.1 Error

`git clone git@github.com:mattyjbrown/scalajs-minimal-repro.git && cd scalajs-minimal-repro && sbt fullOptJS`

Has a problem with https://github.com/cquiroz/scala-java-time/blob/9d646d1fad57d318894eb823bbae4e03a66a1fb7/core/shared/src/main/scala/org/threeten/bp/format/DateTimeFormatterBuilder.scala#L1537 for some reason.
