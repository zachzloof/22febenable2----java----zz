package com.qa.oop.interfaces;

public abstract class Vehicles {
	
	private int age;
	private int numOfWheels;
	private int capacity;
	private String colour;
	public Vehicles() {}
	public Vehicles(int age, int numOfWheels, int capacity, String colour) {
		super();
		this.age = age;
		this.numOfWheels = numOfWheels;
		this.colour = colour;
		this.setCapacity(capacity);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumOfWheels() {
		return numOfWheels;
	}
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Vehicles [age=" + age + ", numOfWheels=" + numOfWheels + ", capacity=" + capacity + ", colour=" + colour
				+ "]";
	}
	
	
	
	
}