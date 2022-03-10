package com.qa.doodles;

public class UKTaxConverter {
	// variables that are not changed, and are used to manipulate values given.
	double nationalInsurance = .92;
	double tax1 = .8;
	double tax2 = .6;
	double tax3 = .55;
	
	//The aim of the method is to break down the input (wage) into sub sections 
	//to work out the tax for that subsection, at the end, it compiles the values 
	//into the string which is returned to the user
	public String methodOne(double income) {
		String message = "";
		double takeHome = 0;
		double unTaxed = 0;
		double bracket1 = 0;
		double bracket2 = 0;
		
		//This is a fail-safe incase the user inputs a negative 
		//value, it will flip the value to a positive value.
		if (income < 0) {
			income *= -1;
		}
		
		//If the user is below all thresholds, the input will be returned as a string
		if (income < 9550) {
			message = "National Insurance + Tax free! \n You will take home: £" + income;
		} else if (income >= 9550 && income <= 12570) {   
			takeHome = income * nationalInsurance;
			message = "Tax free! National Insurance still incurred by 8% \n You will take home: £" + takeHome;
		} else if (income > 12570 && income <= 50270) {
			unTaxed = 12570;
			income = ((income -12570) * nationalInsurance) * tax1;
			takeHome = income + unTaxed;
			message = "You will take home: £" + takeHome;
		} else if (income > 50270 && income <= 150000) {
			unTaxed = 12570;
			bracket1 = 38000 * tax1;
			income = ((income - 50270) * nationalInsurance) * tax2;
			takeHome = income + unTaxed + bracket1;
			message = "You will take home: £" + takeHome;
		} else if (income >150000) { //The users input is broken down into different brackets
			unTaxed = 12570;       // Untaxed money stored in this variable
			bracket1 = 38000 * tax1;   //bracket1 money stored in this variable
			bracket2 = 99730 * tax2;    //bracket2 money stored in this variable
			income = ((income - 150000) * nationalInsurance) * tax3;  //This is in theory the final bracket of income, after deductions have been made
			takeHome = income + unTaxed + bracket1 + bracket2; // This combines all brackets of taxed and untaxed income to return the takeHome value
			message = "You will take home: £" + takeHome;  //integer converted to a string and message is returned
		} 
		return message;
	}
}