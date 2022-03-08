package com.qa.helloworld;

public class Runner {
	
	public static void main(String[] args) {
		
		HelloWorld myObj = new HelloWorld();
		myObj.helloWorld();
		myObj.printMessage("String1", "String2", 10);
		
		String result = myObj.concatText("This", "works");
		
		System.out.println(result);
		
		
		
	}
}
