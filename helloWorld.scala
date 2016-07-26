object helloWorld {
	def main (args: Array[String]) {
		var str = "Hello World"
		var i = 0


		// while loop example
		while(i <= 10) {
			println (str)
			i += 1
		}

		i = 0

		//for loop example
		// simple for loop iterating from 1 to 10
		for (i <- 1  to 10 ) {
			println (i)
		}

		i = 0

		// simple list of String
		var lst = List("a", "b", "c", "d")

		//for loop to iterate through list
		for (i <- 0 until lst.length) {
			println(lst(i))
		}

		//another way to iterate through list using for loop
		//here we use i as temp var to hold list items
		for (i <- lst) {
			println("List Item: "+i)
		}


	}
}