package com.qa.scope;

public class Scope {
	
		public String message = "hello";
		
		public void methodOne() {
			String message = "Goodbye";
			System.out.println(message);
		}
		
		public void methodTwo(String message) {
			System.out.println(message);
		}
}
