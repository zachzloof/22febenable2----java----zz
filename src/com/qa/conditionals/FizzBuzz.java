package com.qa.conditionals;

public class FizzBuzz {
	public String methodOne(int input) {
		String message;
		if (input % 3 == 0 && input % 5 == 0) {
			message = "FizzBuzz";
		} else if (input % 3 == 0) {
			message = "Fizz";
		} else if (input % 5 == 0) {
			message = "Buzz";
		} else {
			message = input + "";
		}
		return message;
	}

}
