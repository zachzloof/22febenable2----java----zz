package com.qa.doodles;

import java.util.List;

public class CarBrandArrays {

	
	List<String> ferrari = List.of("Enzo", "Ferrari 488", "Roma", "F8", "Portofino", "Ferrari 812");
	List<String> tesla = List.of("Model S", "Model 3", "Model X", "Tesla Roadster");
	List<String> BMW = List.of("3 Series", "X Series", "5 Series", "1 Series", "2 Series", "M4", "7 Series", "M3", "M2", "M5");
	List<String> AUDI = List.of("R8", "RS7", "RS6", "A1", "A2", "A3", "A5", "Q Series");
	List<String> lamborghini = List.of("Aventador", "Gallardo", "URUS", "Huracan");
	List<String> ford = List.of("Fiesta", "Focus", "Focus RS", "GT", "Mondeo", "Mustang");
	
	public String methodOne(String y) {
		if (y == "Ferrari" || y == "ferrari") {
			for (int i = 0; i < ferrari.size(); i++) {
				System.out.println(ferrari.get(i));
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
		return "Please select another car brand";
	}

}

