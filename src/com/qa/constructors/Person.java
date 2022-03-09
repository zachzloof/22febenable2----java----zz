package com.qa.constructors;

public class Person {

			public String name;
			public int age;
			public int shoeSize ;
			public Person() {
			}
			public Person(String name, int age, int shoeSize) {
				this.name = name;
				this.age = age;
				this.shoeSize = shoeSize;
			}
			public void eat() {
				System.out.println("Currently eating");
			}
			public void sleep() {
				System.out.println("Currently sleeping");
			}
		
			
			
		}
