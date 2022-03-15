package com.qa.scanner;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
	List<Person> peopleStored = new ArrayList<>();
	
	
	public void addToList (Person input) {
		peopleStored.add(input);
	}
	
	public void outputList () {
		peopleStored.stream().forEach((k) -> {
			System.out.println(k + " ");
		});
	}
	public void findPerson (String input) {
		int length = input.length() + 13;
		int x = peopleStored.size();
	for (int i = 0; i < x; i++) {
		String objectString = peopleStored.get(i) + "";
		String objectChecker = objectString.substring(13, length);
		if (input.equalsIgnoreCase(objectChecker)) {
			System.out.println(objectString);
		}
		
	}
	}
}
