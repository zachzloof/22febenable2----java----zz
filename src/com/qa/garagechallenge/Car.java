package com.qa.garagechallenge;

public class Car extends Vehicles {
	private int BHP;
	private boolean RWD;
	private boolean petrol;
	
	
	//constructor
	public Car(int age, int numOfWheels, int capacity, String colour, int BHP, boolean RWD, boolean petrol) {
		
		//Parent class
		this.setAge(age);
		this.setNumOfWheels(numOfWheels);
		this.setCapacity(capacity);
		this.setColour(colour);
		
		// This class
		this.BHP = BHP;
		this.RWD = RWD;
		this.petrol = petrol;
	}


	public int getBHP() {
		return BHP;
	}


	public void setBHP(int bHP) {
		BHP = bHP;
	}


	public boolean isRWD() {
		return RWD;
	}


	public void setRWD(boolean rWD) {
		RWD = rWD;
	}


	public boolean isPetrol() {
		return petrol;
	}


	public void setPetrol(boolean petrol) {
		this.petrol = petrol;
	}


	@Override
	public String toString() {
		return "Car [BHP=" + BHP + ", RWD=" + RWD + ", petrol=" + petrol + "]";
	}
	
	
	
	
}
