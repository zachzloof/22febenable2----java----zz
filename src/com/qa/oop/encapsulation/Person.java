package com.qa.oop.encapsulation;
//lesson nates
public class Person {
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
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override   //Two string for ui, as strings will be returned in jibberish
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
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
