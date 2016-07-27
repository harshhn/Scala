object strings {
	def main (args: Array[String]) {
		var inpt = "Hello World"

		println("String length: "+ inpt.length)
		println("3rd character in the string: "+ inpt(3))
		println("After concatenation (without updating inpt)... "+ inpt.concat(". My first string manipulation"))
		println("Updating inpt... "+ {inpt = inpt.concat(". My first string manipulation")})
		println("Comparing \'hello world\' with our string: "+ inpt.equals("hello world"))
		println("The word \'first\' appears at index: "+ inpt.indexOf("first")+" in our string \'"+inpt+"\'")

		//convert inpt into an array
		var arr = inpt.toArray
		println("String length: "+inpt.length)
		println("Array length: "+arr.length)

		for(i <- arr) {
			println(i)
		}
	}
}