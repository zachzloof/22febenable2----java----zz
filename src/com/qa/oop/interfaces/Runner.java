package com.qa.oop.interfaces;


public class Runner {

	public static void main(String[] args) {
		Car x4 = new Car(15, 4, 5, "blue", 280, true, false);
		Motorbike kowazaki = new Motorbike(15, 2, 2, "yellow", 150, true);
		Bus london = new Bus(15, 4, 30, "red", 89, true);
		
		Garage garage = new Garage();
		garage.addToGarage(x4);
		garage.addToGarage(kowazaki);
		garage.addToGarage(london);
		
		garage.bill();
		
		System.out.println(garage.removeVehicleByID(2));
		System.out.println(garage.removeVehicleByType("bus"));

	}

	}

}
