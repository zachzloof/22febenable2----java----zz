package com.qa.helloworld;

public class HelloWorld {
	
	public static void helloWorld() {
		String helloWorld = "Hello World\nThis is more text";
		String helloWorldObj = new String("Hello World\nThis is more text");
		System.out.println(helloWorldObj);
	}

	
	public static void printMessage(String messageOne, String messageTwo, int number) {
		System.out.println(messageOne + "\n" + messageTwo + "\n" + number);
	}
	
	public static String concatText(String x, String y) {
		return x + " " + y;
	}

}
