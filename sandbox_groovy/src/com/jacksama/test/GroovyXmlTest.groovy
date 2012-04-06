package com.jacksama.test

class GroovyXmlTest {

	static main(args) {
		GroovyXmlTest test = new GroovyXmlTest();
		test.execute();
	}
	
	def execute() {
		def xml = new File("/Users/jackkim/Test/simple1.xml")
		println xml.text
		
		def document = groovy.xml.DOMBuilder.parse(new FileReader("/Users/jackkim/Test/simple1.xml"))
		def rootElement = document.documentElement
		
		use(groovy.xml.dom.DOMCategory) {
			def lans = rootElement.language
			def name
			def author
			lans.each { lan ->
				name = lan.@name
				println name+', '+author
			}
		}
	}
}
