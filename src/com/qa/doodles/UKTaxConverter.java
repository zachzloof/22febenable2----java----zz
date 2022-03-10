package com.qa.doodles;

public class UKTaxConverter {
	double nationalInsurance = .92;
	double tax1 = .8;
	double tax2 = .6;
	double tax3 = .55;
	public String methodOne(double income) {
		String message = "";
		double takeHome = 0;
		double unTaxed = 0;
		double bracket1 = 0;
		double bracket2 = 0;
		if (income < 0) {
			income *= -1;
		}
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
		} else if (income >150000) {
			unTaxed = 12570;
			bracket1 = 38000 * tax1;
			bracket2 = 99730 * tax2;
			income = ((income - 150000) * nationalInsurance) * tax3;
			takeHome = income + unTaxed + bracket1 + bracket2;
			message = "You will take home: £" + takeHome;
		} 
		return message;
	}
}