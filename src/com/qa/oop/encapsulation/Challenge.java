package com.qa.oop.encapsulation;

import java.util.Arrays;

public class Challenge { //Person challenge
	private String name;
	private int age ;
	private String jobTitle;
	public Challenge(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	@Override
	public String toString() {
		return "Challenge [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
	}
	
	
	
	
	
//	Create a Person class modelling name, age and job title variables.
//
//	Create a method to return all three of these in a formatted string.
//
//	HINT: @Override the toString() method.
//
//	Create some example objects with this class.
//
//	Create a List<> implementation and store those objects inside.
//
//	HINT: it's probably best to put your List<> implementation in a separate class.
//
//	Create a method that can search for a specific Person by their name.
//
//	Use a stream to output all of your people to the console.
//
//	HINT: you can iterate through collections using streams with forEach().
}
