object helloWorld {
	def main (args: Array[String]) {
		//initialize variable (value can be changed)

		//String
		var str = "Hello World"

		//int
		var i = 0

		//print statement
		println(str)

		// while loop example
		println("while loop example")
		while(i <= 10) {
			println (i)
			i += 1
		}

		i = 0

		//do-while example
		println("do-while loop example")
		do {
			println(i)
			i += 1
		} while (i <= 10)

		i = 0

		//for loop example
		// simple for loop iterating from 1 to 10
		println("Simple for loop example")
		for (i <- 1  to 10 ) {
			println (i)
		}

		// simple list of String
		// initialize value (value cant change)
		val lst = List("a", "b", "c", "d")

		//for loop to iterate through list
		println("For loop iterating through a list method 1")
		for (i <- 0 until lst.length) {
			println(lst(i))
		}

		//another way to iterate through list using for loop
		//here we use item as temp var to hold list items
		println("For loop iterating through a list method 2")
		for (item <- lst) {
			println("List Item: "+item)
		}

		//if statements in scala returns a value
		val flg = if(i < 5) "less" else "more"
		println("Flag: "+flg+" since i value is "+i)

		//combining for and if
		//lets try to get all even numbers from 1 to 20
		//store it in a list and print it
		var evenNums = for { i <- 1 to 20
			if(i%2) == 0
		} yield i

		println("List of even numbers: ")

		for (item <- evenNums) {
			println(item)
		}

	}
}