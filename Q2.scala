object Q2 {
	def main(args : Array[String]) {
		val myList = List("Banana","Apple","Orange","Kiwi","Grape","Cherry","Avacado")
		val newList = filterLongString(myList)
		println(myList)
		println(newList)
		}
		 
		 
		def filterLongString(strings: List[String]): List[String] = {
			strings.filter(str => str.length > 5)
		}
			
		
	}
		 