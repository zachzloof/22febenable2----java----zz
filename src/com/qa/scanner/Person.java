package com.qa.scanner;


public class Person {
	public String name;
	public int age;
	public String jobTitle;
	
	public Person() {
	}
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	
	public void eat() {
		System.out.println("Currently eating");
	}
	public void sleep() {
		System.out.println("Currently sleeping");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
	}
	
	
}
