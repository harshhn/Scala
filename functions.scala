object functions {
	def main (args: Array[String]) {
		//invoking the function primeNumbers
		primeNumbers
	}

	def primeNumbers () {
		var primeList = List(1,2,3,5,7,11)

		for (i <- primeList) {
			//following line is similar to break
			if(i == 7)
				return

			//following line is similar to continue
			if(i != 1)
				println(i)
		}
	}
}