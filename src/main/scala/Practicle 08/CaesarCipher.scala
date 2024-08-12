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
    if (shift > 95 || shift < 0) {
      println("Invalid Shift!")
      text
    } else {
      var encryptedText = ""
      for (c <- text) {
        var n = ((c - 32 + shift) % 95 + 32).toChar
        encryptedText  += n
      }
      encryptedText
    }
  }
  def decryptData(encryptedText: String, shift: Int): String = {
    if (shift > 95 || shift < 0) {
      println("Invalid Shift!")
      encryptedText
    } else {
      var text = ""
      for (c <- encryptedText) {
        var n = ((c - 32 - shift + 95) % 95 + 32).toChar
        text += n
      }
      text
    }
  }

  val text = "Hello Scala"
  val shift = 10
  val encryptedText = cipher(text, shift, encriptData)
  println(s"Text to be Encrypt: $text")
  println(s"After Encrypting  : $encryptedText")
  val decryptedText = cipher(encryptedText, shift, decryptData)
  println(s"After Decrypting  : $decryptedText")

}
