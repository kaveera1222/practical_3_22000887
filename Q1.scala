object Q1 {
  def main(args: Array[String]): Unit = {
    val	OriginalString = scala.io.StdIn.readLine("Enter a string: ")
    val reversedString = reverseString(OriginalString)
    println("reversed string is : " + reversedString)
  }

  def reverseString(str: String): String = {
    if (str.isEmpty) {
      ""  
    } else {
      reverseString(str.tail) + str.head  
    }
  }
}
