package com.qa.iteration;

public class Coins {
	public String methodOne (double cost, double amount) {
		
		double change = amount - cost;
		int amTwenties = 0;
		int amTens = 0;
		int amFives = 0;
		int amPounds = 0;
		int amFiftyP = 0;
		int amTwentyP = 0;
		int amTenP = 0;
		int amFiveP = 0;
		int amTwoP = 0;
		int amOneP = 0;

		while (change >= 20) {
				change = change -20;
				amTwenties++;
			} 
		while (change >= 10) {
				change = change -10;
				amTens++;
			} 
		while (change >= 5) {
				change = change -5;
				amFives++;
			}
		while (change >= 1) {
				change = change -1;
				amPounds++;
			} 
		while (change >= .50) {
				change = change -.50;
				amFiftyP++;
			} 
		while (change >= .20) {
				change = change -.20;
				amTwentyP++;
			}
		while (change >= .1) {
				change = change -.1;
				amTenP++;
			} 
		while (change >= .05) {
				change = change -.05;
				amFiveP++;
			}
		while (change >= .02) {
				change = change -.019;
				amTwoP++;
			}
		while (change >= .01) {
				change = change -.009;
				amOneP++;
			} 
		return "20 notes: " + amTwenties + "\n10 notes: " + amTens + "\n5 notes: " + amFives
				+ "\nPound coins: " + amPounds + "\n50p coins: " + amFiftyP + "\n20p coins: " + amTwentyP
				+ "\n10p coins: " + amTenP + "\n5p coins: " + amFiveP + "\n2p coins: " + amTwoP +
				"\n1p coins: " + amOneP;
	}
}
