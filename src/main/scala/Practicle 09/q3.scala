object q93 extends App {
  val toUpper = (text: String) => {
    text.map {
      case c if c > 96 && c < 123 => (c - 32).toChar
      case c                      => c
    }
  }

  val toLower = (text: String) => {
    text.map {
      case c if c > 64 && c < 91 => (c + 32).toChar
      case c                     => c
    }
  }

  val formatNames = (name: String) => {
    toUpper((name.head).toString) + toLower(name.tail)
  }

  println(formatNames("BENNY"))
  println(formatNames("NIroshan"))
  println(formatNames("saman"))
  println(formatNames("KumarA"))

}
