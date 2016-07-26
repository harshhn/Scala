import scala.io.StdIn.{readLine}

object userIOExample {
	def main (args: Array[String]) {
		var num = 0
		do {
			print("Guess the secret number: ")
			num = readLine.toInt	
		} while (num != 6)

		println("You guessed my secret number: "+num)
		
	}
}