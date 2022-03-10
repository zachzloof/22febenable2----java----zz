package com.qa.conditionals;

public class Tax {
	public String methodOne(double wage) {
		String message;
		if (wage < 0) {
			wage = wage * -1;
		}
		if (wage <=14999) {
			message = "You are in the 0% tax bracket";
		} else if (wage <= 19999) {
			message = "You are in the 10% tax bracket";
		} else if (wage <= 29999) {
			message = "You are in the 15% tax bracket";
		} else if (wage <= 44999) {
			message = "You are in the 20% tax bracket";
		} else {
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
			tax = 0;
		} else if (wage <= 19999) {
			tax = wage * .1;
		} else if (wage <= 29999) {
			tax = wage * .15;
		} else if (wage <= 44999) {
			tax = wage * .2;
		} else {
			tax = wage * .25;
		}
		return tax;
	}
	
	public String methodThree(double wage) {
		return this.methodOne(wage) + "\n" + this.methodTwo(wage);
	}
	
	public String takeHome(double wage) {
		double salaryAfterTax = 0;
		if (wage < 0) {
			wage = wage * -1;
		}
		if (wage <=14999) {
			salaryAfterTax = wage;
		} else if (wage <= 19999) {
			salaryAfterTax = wage * .9;
		} else if (wage <= 29999) {
			salaryAfterTax = wage * .85;
		} else if (wage <= 44999) {
			salaryAfterTax = wage * .8;
		} else {
			salaryAfterTax = wage * .25;
		}
		
		return "You will take home: £" + salaryAfterTax;
	}
	

}
