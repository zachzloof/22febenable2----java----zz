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
	public double methodTwo(Double wage) {
		double tax = 0;
		if (wage < 0) {
			wage = wage * -1;
		}
		if (wage <=14999) {
			multiplier = 1;
			tax = 0;
		} else if (wage <= 19999) {
			multiplier = .9;
			tax = wage * .1;
		} else if (wage <= 29999) {
			multiplier = .85;
			tax = wage * .15;
		} else if (wage <= 44999) {
			multiplier = .8;
			tax = wage * .2;
		} else {
			multiplier = .75;
			tax = wage * .25;
		}
		return tax;
	}
	
	public String methodThree(double wage) {
		return this.methodOne(wage) + "\n" + this.methodTwo(wage);
	}
	
	public String takeHome(double wage) {
		double salaryAfterTax = wage * multiplier;
		return "You will take home: £" + salaryAfterTax;
	}
	

}
