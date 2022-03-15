package com.qa.oop.interfaces;

public class Motorbike extends Vehicles {
	private int BHP;
	private boolean petrol;
	
	
		public Motorbike(int age, int numOfWheels, int capacity, String colour, int BHP, boolean petrol) {
		
		//Parent class
		this.setAge(age);
		this.setNumOfWheels(numOfWheels);
		this.setCapacity(capacity);
		this.setColour(colour);
		
		// This class
		this.BHP = BHP;
		this.petrol = petrol;
		}


		public int getBHP() {
			return BHP;
		}


		public void setBHP(int bHP) {
			BHP = bHP;
		}


		public boolean isPetrol() {
			return petrol;
		}


		public void setPetrol(boolean petrol) {
			this.petrol = petrol;
		}


		@Override
		public String toString() {
			return "Motorbike [BHP=" + BHP + ", petrol=" + petrol + "]";
		}
		
		
		
		
		
}
