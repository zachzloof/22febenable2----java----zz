package com.qa.doodles;

import java.util.List;

public class CarBrandArrays {

	//Array lists of different car brands, with the values containing different car models associated with brand.
	List<String> ferrari = List.of("Enzo", "Ferrari 488", "Roma", "F8", "Portofino", "Ferrari 812");
	List<String> tesla = List.of("Model S", "Model 3", "Model X", "Tesla Roadster");
	List<String> BMW = List.of("3 Series", "X Series", "5 Series", "1 Series", "2 Series", "M4", "7 Series", "M3", "M2", "M5");
	List<String> AUDI = List.of("R8", "RS7", "RS6", "A1", "A2", "A3", "A5", "Q Series");
	List<String> lamborghini = List.of("Aventador", "Gallardo", "URUS", "Huracan");
	List<String> ford = List.of("Fiesta", "Focus", "Focus RS", "GT", "Mondeo", "Mustang");
	List<String> bentley = List.of("Continental GT", "Bentayga", "Mulsanne", "Flying spur", "Model S");
	List<String> astonMartin = List.of("Vantage", "DB11", "DB10", "Vulcan", "DB9", "Rapide");
	List<String> vauxhall = List.of("Corsa", "Insignia", "Astra", "Ampera", "Meriva", "Cascada");
	List<String> volkswagen = List.of("Golf", "Polo", "Sirocco", "Passat", "Caddy", "Tiguan");
	
	
	
	
	//methodOne takes the string input given and will compare it against the list names (brands) using if-statements
	public String methodOne(String y) {
		if (y == "Ferrari" || y == "ferrari") {  //Car brand name is checked against the user input, if it matches
			for (int i = 0; i < ferrari.size(); i++) { //Then a loop is formed, and will run the same amount of times as the length of the Array
				System.out.println(ferrari.get(i));  //Every iteration of the loop will print out each value start to finish from the array
			}
		}
		if (y == "Tesla" || y == "tesla") {
			for (int i = 0; i < tesla.size(); i++) {
				System.out.println(tesla.get(i));
			}
		}
		if (y == "BMW" || y == "bmw") {
			for (int i = 0; i < BMW.size(); i++) {
				System.out.println(BMW.get(i));
			}
		}
		if (y == "AUDI" || y == "audi") {
			for (int i = 0; i < AUDI.size(); i++) {
				System.out.println(AUDI.get(i));
			}
		}
		if (y == "Lamborghini" || y == "lamborghini") {
			for (int i = 0; i < lamborghini.size(); i++) {
				System.out.println(lamborghini.get(i));
			}
		}
		if (y == "Ford" || y == "ford") {
			for (int i = 0; i < ford.size(); i++) {
				System.out.println(ford.get(i));
			}
		}
		if (y == "Bentley" || y == "bentley") {
			for (int i = 0; i < bentley.size(); i++) {
				System.out.println(bentley.get(i));
			}
		}
		if (y == "Aston Martin" || y == "aston martin") {
			for (int i = 0; i < astonMartin.size(); i++) {
				System.out.println(astonMartin.get(i));
			}
		}
		if (y == "Vauxhall" || y == "vauxhall") {
			for (int i = 0; i < vauxhall.size(); i++) {
				System.out.println(vauxhall.get(i));
			}
		}
		if (y == "Volkswagen" || y == "volkswagen") {
			for (int i = 0; i < volkswagen.size(); i++) {
				System.out.println(volkswagen.get(i));
			}
		}
		//At the end of each run, the method will ask the user to select another car brand,
		//This happens whether or not the if-statements have run, allowing the user to know if they have
		//put an incorrect/unavailable input.
		return "Please select another car brand";
	}

}

