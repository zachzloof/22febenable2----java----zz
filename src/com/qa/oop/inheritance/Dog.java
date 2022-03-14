package com.qa.oop.inheritance;

public class Dog extends Animal {
	private String breed;
	private boolean isPanting;
	
	
	//constructor
	public Dog(int age, int numOfLegs, String colour, String breed, boolean isPanting) {
		//option 1 for animal properties
		//super(age, numOfLegs, colour);
		
		//option 2 
		//animal properties
		this.setAge(age);
		this.setNumOfLegs(numOfLegs);
		this.setColour(colour);
		
		//dog properties always
		this.breed = breed;
		this.isPanting = isPanting;
	}
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean isPanting() {
		return isPanting;
	}

	public void setPanting(boolean isPanting) {
		this.isPanting = isPanting;
	}
	
	@Override
	public void makeNoise() {
		System.out.println("BARK!!!!");
		
	}
	
	@Override
	public String toString() {
		return "Dog [age=" + this.getAge() + ", numOfLegs=" + this.getNumOfLegs() +
					", colour=" + this.getColour() + ", breed= " + breed + ", isPanting = " + isPanting + "]";
	}
	

}
