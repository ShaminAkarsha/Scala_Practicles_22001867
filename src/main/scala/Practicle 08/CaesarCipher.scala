// ASCII printable characters (character code 32-127)
// 127 - 32  = 95
object CaesarCipher extends App {
  def cipher(
      text: String,
      shift: Int,
      operation: (String, Int) => String
  ): String = {
    operation(text, shift)
  }

  def encriptData(text: String, shift: Int): String = {
    text.map {
      case c if c.isLower => ((c - 'a' + shift) % 26 + 'a').toChar
      case c if c.isUpper => ((c - 'A' + shift) % 26 + 'A').toChar
      case c              => c
    }
  }

  def decryptData(text: String, shift: Int): String = {
    val shift_n = shift % 26
    text.map {
      case c if c.isLower => ((c - 'a' - shift_n + 26) % 26 + 'a').toChar
      case c if c.isUpper => ((c - 'A' - shift_n + 26) % 26 + 'A').toChar
      case c              => c
    }
  }

  val text = "Hello Scala"
  val shift = 1000
  val encryptedText = cipher(text, shift, encriptData)
  println(s"Text to be Encrypt: $text")
  println(s"After Encrypting  : $encryptedText")
  val decryptedText = cipher(encryptedText, shift, decryptData)
  println(s"After Decrypting  : $decryptedText")

}
