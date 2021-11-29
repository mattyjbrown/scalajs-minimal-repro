package tutorial.webapp

import java.time.format.DateTimeFormatter

object Formatters {
  val formatter: DateTimeFormatter =
    DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSz")
}
