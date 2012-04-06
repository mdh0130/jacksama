package com.jacksama.test

class GroovyExploreTest {

	static main(args) {
		GroovyExploreTest test = new GroovyExploreTest();
		test.test();
	}

	def test() {
		String str1 = 'hello'
		println str1.dump()
		
		def arr1 = [1,2,3,4,5]
		arr1.identity {
			println size();
			add(6)
			println contains(6)
			println "${delegate}"
		}
		new Object().sleep(1000)
		println 10**9
		
		def process = "wc".execute()
		process.outputStream.withWriter {
			it << "Let the world know...."
		}
		println process.in.text
		
		new File("/Users/jackkim/Test/groovy_test.txt").withWriter {
			file -> file << "Hello, World!\n-- From Jack"
		}
	}
}
