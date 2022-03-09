package com.qa.constructors;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Person anoush = new Person("Anoush", 28, 12);
			System.out.println("My name is " + anoush.name);
			System.out.println("My age is "+ anoush.age);
			System.out.println("My shoe size is "+ anoush.shoeSize);
			anoush.eat();
			Person john = new Person("john", 28, 15);
			System.out.println("My name is "+ john.name);
			System.out.println("My age is "+ john.age);
			System.out.println("My shoe size is "+ john.shoeSize);
			john.sleep();
			Person micheal = new Person("Micheal", 20, 10);
			System.out.println("My name is "+ micheal.name);
			System.out.println("My age is "+ micheal.age);
			System.out.println("My shoe size is "+ micheal.shoeSize);
			Person leonard = new Person("Leonard", 19, 8);
			System.out.println("My name is "+ leonard.name);
			System.out.println("My age is "+ leonard.age);
			System.out.println("My shoe size is "+ leonard.shoeSize);
			leonard.sleep();
			//default values 
			Person p = new Person();
			System.out.println("My name is "+ p.name);
			System.out.println("My age is "+ p.age);
			System.out.println("My shoe size is "+ p.shoeSize);
	}

}
