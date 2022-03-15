package com.qa.scanner;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HOW TO INTRODUCE USER INPUT PROPERLY
		//calculator below
//		Calculator object = new Calculator();
//		
//		object.startApp();
		
		
		//Person excersize below
		Person zach = new Person("Zach", 24, "Coder");
		Person anoush = new Person("Anoush", 28, "Coder");
		Person john = new Person("john", 28, "Physicist");
		Person leonard = new Person("Leonard", 19, "Coder");
		PersonManager management = new PersonManager();
		management.addToList(zach);
		management.addToList(anoush);
		management.addToList(john);
		management.addToList(leonard);
		management.outputList();
		management.findPerson("Zach");
		 // second part not done yet v confused
		
		
		Scanner scanner = new Scanner(System.in);
		
		boolean flag = true;
			while (flag) {   //keeps program executing without crashing as the input is holding the loop from running amuk
				System.out.println("Would you like to create a new person (1), output all people to the console (2), or search for a specific person? (3)");
				Integer choice = scanner.nextInt();
				scanner.nextLine();
				String restart;
				String name;
				int age;
				String jobTitle;
				switch (choice) {
				case 1: {
					System.out.println("You have selected create a new person, please enter name, followed by age, followed by job title in this order.");
					name = scanner.nextLine();
					scanner.nextLine();
					age = scanner.nextInt();
					scanner.nextLine();
					jobTitle = scanner.nextLine();
					System.out.println(name + age + jobTitle + "");
					
					break;
				} 
				case 2: {
					System.out.println("You have selected to output all the people available");
					management.outputList();
					break;
				}
				case 3: {
					System.out.println("Who would you like to find? Please capitalize first letter of the name.");
					name = scanner.nextLine();
					management.findPerson(name);
					break;
				}
				default: {
					System.out.println("You have not selected one of the 3 options, please use an integer next time.");
					
					break;
				}
				}
				System.out.println("Would you like to continue using the app? (y/n)");
				restart = scanner.nextLine();
				if (restart.equalsIgnoreCase("y")) {     // this piece of code allows the user to control if the app keeps running or 
				continue;							// allows the user to keep the program running if an invalid value is inputted
				
					} else if (restart.equalsIgnoreCase("n")) {
						flag = false;
						continue;
						} else {
							System.out.println("You entered an invalid value. Restarting app");
			}
		}
		
		scanner.close();
		}
}
		// CLASE NOTES BELOW
		
//		System.out.println("Enter a number: ");
//		Integer numberOne = scanner.nextInt();
//		
//		scanner.nextLine(); // Consume the leftover \n stopping the rest from working
//	
//		
//		
//		System.out.println("Enter a value");
//		String text = scanner.nextLine();
//		
//		System.out.println("Value 1 = " + numberOne);
//		System.out.println("Value 2 = " + text);
		
//		System.out.println("Enter a number: ");
//		Integer numberTwo = scanner.nextInt();
//		
//		System.out.println(numberOne + numberTwo);
//		
		
//		scanner.close();

//	}
//
//}
