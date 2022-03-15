package com.qa.oop.interfaces;

import java.util.ArrayList;
import java.util.List;


public class Garage {
	
	List<Vehicles> vehiclesStored = new ArrayList<>();
	//USE VOID WHEN THERE IS NO RETURN
	public void addToGarage (Vehicles input) {
		vehiclesStored.add(input);
	}
	public void bill () {
		vehiclesStored.stream().forEach((k) -> {
			System.out.println("Vehicle no. " + k);
			if (k instanceof Car) {
				System.out.println("Bill = £25 per day");
			
				} else if (k instanceof Motorbike) {
						System.out.println("Bill = £15 per day");
					} else if (k instanceof Bus) {
							System.out.println("Bill = £40 per day");
						}
		});
	}
	
	public String removeVehicleByID(int id) {
		id--;
		vehiclesStored.remove(id);
		id++;
		return "Vehicle no. " + id + " removed";
	}
	
	public String removeVehicleByType(String type) {
		type = type.strip();
		type = type.toLowerCase();
		
		if (type == "car") {
			for (int i = 0; i < vehiclesStored.size(); i++) {
				if (vehiclesStored.get(i) instanceof Car) {
					vehiclesStored.remove(i);
				}
			}
		}
			
			if (type == "motorbike") {
				for (int i = 0; i < vehiclesStored.size(); i++) {
					if (vehiclesStored.get(i) instanceof Motorbike) {
						vehiclesStored.remove(i);
					}
				}
			}
			
			if (type == "bus") {
				for (int i = 0; i < vehiclesStored.size(); i++) {
					if (vehiclesStored.get(i) instanceof Bus) {
						vehiclesStored.remove(i);
					}
				}
			}
		
		return "All vehicles belonging to the " + type + " type have been cleared!\n--------------------------------";
	}
	
	public void clearGarage () {
		vehiclesStored.clear();
		System.out.println("Garage cleared and is now empty!\n-----------------------------");
	}

}
