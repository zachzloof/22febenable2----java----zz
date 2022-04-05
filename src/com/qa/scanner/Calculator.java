package com.qa.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	boolean flag = true;
	String methodType;
	Scanner scanner = new Scanner(System.in);
	
	public void startApp() {
		while (flag) {   //keeps program executing without crashing as the input is holding the loop from running amuk
			

			try {  // EXCEPTIONS LESSON TAKEN FROM SCANNER.CALCULATOR
				System.out.println("Enter two integers");
				int num1 = scanner.nextInt();
				int num2 = scanner.nextInt();
			} catch (InputMismatchException ime) { //CAN JUST PUT EXCEPTION AS PARENT CLASS	
				System.out.println("Error please enter a number!");
				scanner.nextLine();
				continue;
			} catch (Exception e) { //CAN HAVE MULTIPLE CATCHES, BUT EXCEPTION MUST GO LAST	
				System.out.println("Error please enter a number!");
				scanner.nextLine();
				continue;
			} finally { // ALWAYS RUNS
				System.out.println("Finaaally");
			}
			
			
			
			
			
			
			System.out.println("What type of calculation would you like to perform?");
			methodType = scanner.nextLine();
			System.out.println("Enter your first number: ");
			Integer x = scanner.nextInt();
		
			System.out.println("Enter your second number: ");
			Integer y = scanner.nextInt();
			scanner.nextLine();
			if (methodType.equalsIgnoreCase("addition")) {
			System.out.println(add(x, y));
			} else if (methodType.equalsIgnoreCase("subtraction")) {
				System.out.println(subtract(x, y));
			} else if (methodType.equalsIgnoreCase("division")) {
				System.out.println(divide(x, y));
			} else if (methodType.equalsIgnoreCase("multiply")) {
				System.out.println(multiply(x, y));
			} else {
				System.out.println("Invalid calculation type, please choose between: Addition, subtraction, division. and multiply");
			}
			System.out.println("Would you like to continue? (y/n)");
		
			String choice = scanner.nextLine();
			
			if (choice.equalsIgnoreCase("y")) {     // this piece of code allows the user to control if the app keeps running or 
			continue;							// allows the user to keep the program running if an invalid value is inputted
			
				} else if (choice.equalsIgnoreCase("n")) {
					flag = false;
					continue;
					} else {
						System.out.println("You entered an invalid value. Restarting app");
		}
	}
		scanner.close();
	}
	
	public int add(int x, int y) {
		return x + y;
	}
	public int multiply(int x, int y) {
		return x * y;
	}
	public int subtract(int x, int y) {
		return x - y;
	}
	public double divide(int x, int y) {
		return x / y;
	}
	
	
}
