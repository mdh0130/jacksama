package com.jacksama.test

class GroovyMapTest {
	
	def simpleFunc(a, b, c) {
		println a+b+c
	}

	static main(args) {
		GroovyMapTest test = new GroovyMapTest();
		test.execute()
	}
	
	def execute() {
		def strArr = ['boys','be','ambicious']
		println strArr*.size()
		println strArr.join(' ')
		simpleFunc(*strArr)
		println strArr.collect { it.replaceAll('b','z') }
		
		def strMap = [brian1: 'Brian Talbot', brian2: 'Brian Lewis', jason1: 'Jason Lee', jason2: 'Jason Mraz', jack: 'Jack Kim']
		println strMap.collect { key, value -> key.replaceAll('n','m') }
		println strMap.findAll { key, value -> value =~ "Kim" }

		def strMap2 = ['Brian Talbot', 'Brian Lewis', 'Jason Lee', 'Jason Mraz', 'Jack Kim']
		println strMap2.groupBy { it.split(' ')[0] }.each { firstname, groups -> println "$firstname : ${groups.join(' ')}" }
	}
}
