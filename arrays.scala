import scala.collection.mutable.ArrayBuffer

object arrays {
	def main (args: Array[String]) {
		//Use ArrayBuffer if you are going to store variable size of elements
		
		// declare an ArrayBuffer
		var names = ArrayBuffer[String] ()

		//insert element using native insert() method
		names.insert(0, "Chandler")

		//insert into next available slot
		names += "Joey"

		//insert multiple values
		names ++= Array("Ross", "Phoebe")

		//insert elements from a given index
		names.insert(1, "Monica", "Rachel", "X")

		//remove element
		names.remove(3, 1)

		//iterate and print the arraybuffer
		for(name <- names)
			println(name)

		//Use Array if we know the size of how many elements we are going to store
		//declare and initialize the array
		var nums = new Array[Int] (20);

		//initialize an array with values directly
		var str = Array("oNe", "two")

		//change the value at specific index directly
		str(0) = "one"

		//print the array
		println("Printing Array.. Ex: 1")
		for(i <- 0 to str.length-1)
			println(str(i))

		//manipulate array elements

		//set some value to all elements in the array
		for(i <-0 to nums.length-1) {
			nums(i) = i
		}

		//get sum of all elements in an array
		println("Sum of all elements: "+nums.sum)

		//get min value from the array
		println("Min val: "+nums.min)

		//get max value from the array
		println("Max val: "+nums.max)

		//sort the array in ascending order
		val ascSorted = nums.sortWith(_<_)

		//sort the array in descending order
		val descSorted = nums.sortWith(_>_)

		//print an array as a delimited string
		println("Printing array as strings...")

		//This will print the contents of the array as (, ) separated strings
		println(descSorted.deep.mkString(", ")) 

		//yield is used to modify array element and return the modified value
		var numModified = for(i <- nums) yield i * 5

		//use foreach to print numModified array
		numModified.foreach(println)

		//perform additional operations
		var evenNums = for(i <- numModified if i % 2 == 0) yield i
		println("Printing even numbers..")
		evenNums.foreach(println)

		//Multi dimensional arrays
		var matrix = Array.ofDim[Int] (10,10)

		//create multi dimensional array
		for(i <- 1 to 10) {
			for(j <- 1 to 10) {
				matrix(i-1)(j-1) = i*j
			}
		}

		//print the elements
		println("Printing multi-dimensional array...")
		for(i <- 0 to 9; j <- 0 to 9)
			printf("For i = %d and j = %d, val = %d \n", i,j,matrix(i)(j) )

	}
}