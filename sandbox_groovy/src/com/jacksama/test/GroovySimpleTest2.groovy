package com.jacksama.test

class GroovySimpleTest2 {
	class Car {
		def miles = 0
		final year
		
		Car(theYear) {
			year = theYear
		}
	}
	
	class Robot {
		def type, height, width
		
		def access(location, weight, fragile) {
			println "fragile? $fragile, weight: $weight, loc: $location"
		}
	}
	
	static main(args) {
		GroovySimpleTest2 test = new GroovySimpleTest2();
		test.execute();
	}
	
	def execute() {
		Car car = new Car(2008)
		println "Year: $car.year"
		
		Robot robot = new Robot(type:'arm', width:10, height:40)
		println "$robot.type, $robot.height, $robot.width"
		
		robot.access(x:30,y:20,z:10, 50, true)
    }
}
