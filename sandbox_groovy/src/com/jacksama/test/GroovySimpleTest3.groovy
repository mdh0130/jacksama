package com.jacksama.test

class GroovySimpleTest3 {

	static def isPal(str) { str.reverse() }
	static main(args) {
		def str1 = 'test'
		println str1?.value

		def str2 = null
		print str2?.value
		print '======'
		
		def lst = ['first']
		lst << 'second'
		println lst
		
		println lst.getClass().name
		
		def int1 = 5
		println int1.getClass().name
		
		println "mam i palindrome? ${isPal('mama')}"
		
		int[] intArr = [1,2,3,4,5]
		for (i in intArr) print i
		println intArr.getClass().name
	}
}
