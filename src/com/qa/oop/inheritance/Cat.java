package com.qa.oop.inheritance;

public class Cat extends Animal{
	
	private String breed;
	private boolean purring;
	
	public Cat(int age, int numOfLegs, String colour, String breed, boolean purring) {
		
		this.setAge(age);
		this.setNumOfLegs(numOfLegs);
		this.setColour(colour);
		
		this.breed = breed;
		this.purring = purring;
	}
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean purring() {
		return purring;
	}

	public void setPurring(boolean purring) {
		this.purring = purring;
	}
	
	@Override
	public void makeNoise() {
		System.out.println("MEOW!!!");
		
	}

	@Override
	public String toString() {
		return "Cat [age=" + this.getAge() + ", numOfLegs=" + this.getNumOfLegs() +
					", colour=" + this.getColour() + ", breed= " + breed + ", purring = " + purring + "]";
	}
}
