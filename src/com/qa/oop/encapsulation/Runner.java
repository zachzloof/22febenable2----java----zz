package com.qa.oop.encapsulation;

import java.util.Arrays;
import java.util.List;
public class Runner {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tutorial/lecture
//		Person anoush = new Person("Anoush", "Lowton", 28);
//		Person zach = new Person("zach", "zloof", 28);
//		Person jonah = new Person("Jonah", "Hill", 28);
//		
//		// this will not work as the variable is private 
//		//anoush.age = 9999;
//		// System.out.println(anoush.age);
//		System.out.println(anoush.getAge());
//		anoush.setAge(0);  // this works with getters and setters
//		//Source ---> generate getters and setters ---> select variables
//		System.out.println(anoush);
//
//		
		//Challenge
		Challenge fred = new Challenge("Fred", 28, "Coder");
		Challenge ted = new Challenge("ted", 18, "Lawyer");
		Challenge jed = new Challenge("jed", 27, "Real Estate");
		Challenge ed = new Challenge("ed", 31, "Teacher");
		Challenge lenny = new Challenge("Lenny", 45, "Coder");
		String input = "ed";
		input = input.strip();
		boolean flag = false;
		int length = input.length() + 16;
		List<Challenge> listOfObjects  = Arrays.asList(fred, ted, jed, ed, lenny);
		int x = listOfObjects.size();
		for (int i = 0; i < x; i++) {
			String objectString = listOfObjects.get(i) + "";
			String objectChecker = objectString.substring(16, length);
			flag = input.equalsIgnoreCase(objectChecker);
			if (flag) {
				System.out.println(objectString);
			}
			
		}
		System.out.println("----------------------------------------------\n");
		listOfObjects.stream().forEach((k) -> {
			System.out.println(k + " ");
		});
						
		
	}

}
//16