object maps_tuples {
	def main (args: Array[String]) {
		//Maps in scala

		//Immutable Maps -- values cant be changed
		val staffs = Map(
						 "HOD" -> "Peter Chan",
						 "Lecturer" -> "John Smith"
						)

		if(staffs.contains("HOD"))
			println("Our HOD is: "+staffs("HOD"))

		//Mutable Maps
		val employees = collection.mutable.Map(
												123 -> "Alex", 
												124 -> "Bob",
												125 -> "Cathy"
											  )

		//alter value of a Map entry
		employees(125) = "Chan"

		//add a new employee
		employees(126) = "Derek"

		//print all keys and values from the Map
		for((key,value) <- employees) {
			//printing using println
			println(key+" -- "+value)

			//printing using printf statement
			//printf("%d -- %s\n",key, value)
		}

		/*
		Tuples in Scala are immutable
		They can hold different types of objects together

		Currently there is a limit of 22 elements per tuple
		If we need to store more than 22, we need to use collections
		*/

		var tpl = (123, "Alex", "$123456")

		//print contents of tuple
		println("Printing contents of a tuple...")
		println("Emp_Id: "+tpl._1+" Emp Name: "+tpl._2+" Salary: "+tpl._3)

		//iterate through tuple
		println("Iterating tuple using productIterator...")
		tpl.productIterator.foreach{itm => println(itm)}

		//converting tuple into a string
		println("Converting tuple into a string...")
		println(tpl.toString())



	}
}