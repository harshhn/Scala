object classes {
	//I will try to implement https://github.com/harshhn/Twitter/blob/master/src/my/personal/code/Point.java in Scala
	def main (args: Array[String]) {
		//create objects for class Point
		val p1 = new Point
		println("P1 created using no argument constructor: "+p1.toString())

		val p2 = new Point
		p2.setX(1)
		println("P2 created using setter methods: "+p2.toString())

		val p3 = new Point(2)
		println("P3 created using single argument constructor: "+p3.toString())

		val p4 = new Point(3,1)
		//demonstrating how to use objects within println statement
		println(s"P4 is created using default constructor and its x value is ${p4.getX} its y value is ${p4.getY} and its id is ${p4.id}")

		val p5 = new ThreeD
		println("P5 is created using no argument constructor of 3D class: "+p5.toString)

		val p6 = new ThreeD(2)
		println("P6 is created using single argument constructor of 3D class: "+p6.toString)

		val p7 = new ThreeD(2,3)
		println("P7 is created using two argument constructor of 3D class: "+p7.toString)

		val p8 = new ThreeD(2,3,4)
		p8.setX(5) // has no effect.. why??
		println("P8 is created using default constructor of 3D class: "+p8.toString)
	}

	//The class name works as a class constructor which can take a number of parameters.
	class Point (var x: Int, var y: Int) {
		//demonstrating how to protect the values
		this.setX(x)

		/*
		Scala does not have static methods or static variables.
		However we can mimic its behavior. 

		Outside the scope of the class, create a companion object for the class
		Companion objects has same name as that of the class and holds the static members and functions.
		*/

		val id = Point.getId

		//lets define getters and setters
		def getX() : Int = x
		def getY() : Int = y

		def setX(x: Int) {
			this.x = x
		}

		//this is how we override a function
		//here we implement our custom toString() method
		override def toString() : String = {
			return "(%d, %d) and id is %d".format(this.x, this.y, this.id)
		}

		//lets define other constructors

		//to define a constructor, we create a method called "this"
		//constructor with no arguments
		def this () {
			this(0,0)
		}

		//constructor with 1 value
		def this (x: Int) {
			this(0,0)
			this.setX(x)
		}

		
	}

	object Point {
		//static member
		private var id = 0

		//static method
		private def getId () : Int = { id += 1; id}
	}

	//Inheritance
	class ThreeD (x: Int, y: Int, z: Int) extends Point (x, y) {
		def this(x: Int, y: Int) {
			this(0,y,0)
			this.setX(x)
		}

		def this(x: Int) {
			this(0,0,0)
			this.setX(x)
		}

		def this() {
			this(0,0,0)
		}

		override def setX(x: Int) {
			super.setX(x)
		}

		override def toString() : String = {
			return "(%d, %d, %d) and id is %d".format(this.x, this.y, this.z, this.id)
		}
	}
}