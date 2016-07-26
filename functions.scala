object functions {
	def main (args: Array[String]) {
		/*
		Please note: In the below basic structure, anything within [] is optional
		Basic structure:

			def <fn_name> (<arg1>:<data_type> [= <default_value>], <arg2>:<dataType>) [: <returnType> = ]{
				//body of the function

				return <value>
			}
		*/

		//invoking the function primeNumbers() without arguments
		primeNumbers
		println()

		//invoking function sumNumbers() without parameter
		println("Invoking sumNumbers without arguments : "+sumNumbers())

		//invoking function sumNumbers() with parameter
		println("Invoking sumNumbers with 6 and 7: "+sumNumbers(6,7))

		//invoking function sumNumbers() but using named parameters
		//Note that named parameters should be part of function. You can't use random names.
		println("Invoking sumNumbers with named parameters: "+sumNumbers(num2 = 10, num1 = 20))

		//invoking function getSum() with variable num of args
		println("Invoking getSum with variable number of parameters: "+getSum(1,3,5,6,3,8,9,23))

		//invoking recursive function
		println("Fibonnaci of first 8 numbers: "+fibonacci(8))


	}

	// if a function doesnt return anything (procedures) we use Unit as return type
	def primeNumbers () : Unit = {
		var primeList = List(1,2,3,5,7,11)

		for (i <- primeList) {
			//following line is similar to break
			if(i == 7)
				return

			//following line is similar to continue
			if(i != 1)
				print(i)
		}
	}

	def sumNumbers (num1: Int = 1, num2: Int = 4): Int = {
		//return statement is optional here
		//scala executes last statement of a function and returns it by default
		return num1+num2
	}

	// function that takes variable number of arguments and returns Int
	def getSum (nums: Int*): Int = {
		var sum : Int = 0

		for(num <- nums) {
			sum += num
		}

		sum
	}

	// recursive function
	def fibonacci (num: BigInt) : BigInt = {
		if(num == 1)
			0
		if(num == 2 || num == 3)
			1
		else fibonacci(num-1) + fibonacci(num-2)
	}
}