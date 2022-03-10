package com.qa.array;

public class Arrays {
	public String methodOne() {
		int [] array1 = new int[10];
		for (int i = 0; i < 10; i++) {
			array1[i] = i;
			System.out.println(array1[i]);
		}
		System.out.println("--------\n");
		for (int i = 0; i < 10; i++) {
			array1[i] *= 10;
			System.out.println(array1[i]);
		}
		
		//for (int i = 0; i < finalArray.length; i++) {
//			System.out.println(finalArray[i]);
		return "";
		
	}


}
