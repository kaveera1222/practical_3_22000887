object Q3 {

  def main(args: Array[String]): Unit = {
    println(average(34,41))
	println(roundToTwoDecimalsPrecise)
  }

	def average(num1 : Int,num2 : Int): Double = {
		val avr = (num1.toDouble + num2.toDouble)/2
		avr
	}
	def roundToTwoDecimalsPrecise(): BigDecimal = {
		val bd = BigDecimal(average(34,41))
		bd.setScale(2, BigDecimal.RoundingMode.HALF_UP)
	}
  
	}

	