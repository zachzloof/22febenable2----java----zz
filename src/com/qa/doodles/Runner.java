package com.qa.doodles;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This will create an object for the UK Tax Converter, 
		//and print out the result of the income that is inputted
//			UKTaxConverter object = new UKTaxConverter();
//			System.out.println(object.methodOne(17500));
//			
//			CarBrandArrays myObj = new CarBrandArrays();
//			System.out.println(myObj.methodOne("aston martin"));
		
		MMADoodle mmaObject = new MMADoodle();
//		String champion = "s";
		String input = "  middleweight  ";
		int whichChampIndex = 1;
//		System.out.println(mmaObject.fighter(champion));
		System.out.println(mmaObject.titleHistory(input));
		System.out.println(mmaObject.divisionRecords(input));
		System.out.println(mmaObject.indexChamp(input, whichChampIndex));
		
		
	}

}
