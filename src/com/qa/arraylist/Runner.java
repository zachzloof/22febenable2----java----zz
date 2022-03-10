package com.qa.arraylist;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a new arraylist
		List<String> listOfStrings = new ArrayList<>();
		
		
		// returns an unmodifiable aka immutable list
		List<String> listOfStrings2 = List.of("Hello", "There");
		
		// this one returns a regular list
		List<String> listOfStrings3  = Arrays.asList("Hello, There");
		
		//how to add
		listOfStrings.add("Hello");
		listOfStrings.add("There");
		
		//how we get values
		System.out.println(listOfStrings.get(1));
		
		//change a value
		listOfStrings.set(0,  "Hi");
		System.out.print(listOfStrings.get(0));
		
		//removing element and change length, no default value
		listOfStrings.remove(1);
		
		//get the length of array list
		System.out.println("The length is: " + listOfStrings.size());
		
		// Clears the whole array
		listOfStrings.clear();
		
		
		//gets everything out of list in order with reference to index
		for (int i = 0; i < listOfStrings.size(); i++) {
			System.out.println(listOfStrings.get(i));
		}
		//gets everything out of the list no index
		for (String x : listOfStrings) {
			System.out.println(x);
		}		
		
		// Gives us the index position of an element if it exists
		listOfStrings.indexOf("Hi"); // returns -1 if it doesnt exist within the array
	
		//Tells us whether the value exists within an array
		listOfStrings.contains("Hi"); // returns true if Hi exists

	}

}
