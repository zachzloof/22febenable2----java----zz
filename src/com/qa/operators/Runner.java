package com.qa.operators;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int numOne = 5;
//		int numTwo = 10;
//		
//		System.out.println(numOne + numTwo);
//		System.out.println(numOne - numTwo);
//		System.out.println(numOne * numTwo);
//		System.out.println((float)numOne / numTwo);
//		numOne += 1;
		Operators newObj = new Operators();
		//System.out.println(newObj.add(1, 3));
		//System.out.println(newObj.multiply(3, 6));
		//System.out.println(newObj.subtract(5, 5));
		//System.out.println(newObj.divide(100, 3));
		
		Results result = new Results();
		System.out.println(result.methodOne(35, 21, 90));
		System.out.println(result.methodTwo(Results.total));
	}
		

}
