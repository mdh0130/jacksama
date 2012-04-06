package com.jacksama.test

class GroovyWayTest1 {

	static def pickEven(n, block) {
		for (int i=2; i<=n; i+=2) {
			block(i)
		}
	}

	static main(args) {
		def test1 = new GroovyWayTest1()
		test1.execute()
	}
	
	def execute() {
		pickEven(10, { println it })
//		pickEven(10) { println it }

		def adder = {x,y -> return x+y}
		def addOne = adder.curry(1)
		println addOne(5)
		
		String str1 = 'sunny'
		println str1[2]
		
		String str2 = "today is $str1"
		
		println str2
		str1 = 'groomy'
		println str2

		String company
		int price
		
		String quote = "${->company} closed at ${->price}"
	
		def stocks = [Apple:130, Microsoft: 230]
		stocks.each { key, value ->
			println "$key closed at $value"
			company = key
			price = value
			println quote
		}
		
		def regE = ~"(j|J)ack"
		if ('Jack' =~ regE) println 'match'
		
		String longSen = "jack is really handsome"
		println longSen - 'handsome'
	}
}
