package com.qa.arraylist;

import java.util.Arrays;
import java.util.List;

public class Excersize {
	public String methodOne(String y) {
List<String> ferrari = Arrays.asList("Enzo", "Ferrari 488", "Roma", "F8", "Portofino", "Ferrari 812");

	ferrari.add("Hello");
	if (y == "Ferrari" || y == "ferrari") {  //Car brand name is checked against the user input, if it matches
		for (int i = 0; i < ferrari.size(); i++) { //Then a loop is formed, and will run the same amount of times as the length of the Array
			System.out.println(ferrari.get(i));  //Every iteration of the loop will print out each value start to finish from the array
		}
	}
	ferrari.remove(6);
	System.out.println(ferrari);
	return " ";
	}

}
