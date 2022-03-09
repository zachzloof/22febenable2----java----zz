package com.qa.conditionals;

public class Tax {
	double multiplier;
	double storedWage;
	public String methodOne(double wage) {
		String message;
		if (wage < 0) {
			wage = wage * -1;
		}
		
		if (wage <=14999) {
			multiplier = 1;
			message = "You are in the 0% tax bracket";
		} else if (wage <= 19999) {
			multiplier = .9;
			message = "You are in the 10% tax bracket";
		} else if (wage <= 29999) {
			multiplier = .85;
			message = "You are in the 15% tax bracket";
		} else if (wage <= 44999) {
			multiplier = .8;
			message = "You are in the 20% tax bracket";
		} else {
			multiplier = .75;
			message = "You are in the 25% tax bracket";
		}
		return message;
			
	}
	
	public String methodTwo(double wage) {
		double salaryAfterTax = wage * multiplier;
		return "You will take home: £" + salaryAfterTax;
	}
	

}
