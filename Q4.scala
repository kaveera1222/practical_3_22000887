object Q4 {
	def main(args : Array[String]) {
		
	var integers = List(1,2,3,4,5,6,7,8,9,10)
	val sumOfEvenNumbers = sumEvenNumbers(integers)
	println("The sum of even nubmers in the List is : " + sumOfEvenNumbers)
	}
	
	def sumEvenNumbers(list : List[Int]): Int = {
		list.foldLeft(0) { (acc,element) =>
			if(element % 2 == 0) {
				acc + element
				}
			else {
				acc
				}
			}
		}

	}