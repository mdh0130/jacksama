package com.jacksama.test

class GroovySimpleTest1 {
    static main(args) {
        println('Hello, World!')
        def trees = ['a','b']
        println trees.count
        def var1 = 'jack'
        println var1

		for (i in 0..4) {
			println i
		}
		
		0.upto(3) { print "$it" }
		3.times { print "$it" }
		
		println 'evil'?.reverse()
		println "uptime".execute().text

		try {
			foo('test')
		} catch(ex) {
			println "Oops:" + ex
		}
		
    }
}