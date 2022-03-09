package com.qa.operators;

public class Results {
	public int physics;
	public int biology;
	public int chemistry;
	public static int total;
	public int percentage;
		
	
//	public Results(int physics, int biology, int chemistry) {
//		super();
//		this.physics = physics;
//		this.biology = biology;
//		this.chemistry = chemistry;
//		this.total = physics + biology + chemistry;
//	}
	public  String methodOne(int physics, int biology, int chemistry) {
		total = physics + biology + chemistry;
		return "Physics mark: " + physics + "\n" +
		"Biology mark: " + biology + "\n" +
		"Chemistry mark: " + chemistry + "\n" +
		"Total: "+ total;
	}
	public String methodTwo(int total) {
		percentage = (total * 100) / 450;
		return "Percentage: " + percentage;
	}
}


