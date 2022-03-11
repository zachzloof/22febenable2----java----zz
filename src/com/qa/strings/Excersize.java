package com.qa.strings;

public class Excersize {
	public String beginner() {
	 String string1 = "yesterday it was raining";
	 String string2 = "today it is sunny";
	 System.out.println(string2.toLowerCase()+", " + string1.toUpperCase());
	 String string3 = string2.substring(0, 11) + string1.substring(16, 24);
	 System.out.println(string3.toUpperCase());
	 return " ";
}
	public String methodOne(String y) {
		String[] b = y.split(" ");
		int x = (b.length);
		return "Words: " + x;
	}
	
	
	//more robust version
	
	
	
	public String methodTwo(String y) {
		int x = y.length();
		for (int i = 0; i < x; i++) {
			System.out.println(y.charAt(i));
		}
		return " ";
	}
	
	
	
	public String methodThree(String y) {
		int x = y.length();
		String[] b = y.split("");
		for (int i = x-1; i >= 0; i--) {
			System.out.println(b[i]);
		}
		
		return " ";
	}
	
	public boolean methodFour(String x, String y) {
		
		return true;
	}
	}
