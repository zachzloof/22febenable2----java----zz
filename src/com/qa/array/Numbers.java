package com.qa.array;
import java.util.Random;

public class Numbers {
	public String methodOne() {
	int a = 0;
	int b = 0;
	int c = 0;
	Random rand = new Random();
	int random = rand.nextInt(99);
	if (random < 10) {
		random += 10;
	}
	System.out.println(random);
	b = random % 10;
	random = random / 10;
	a = random % 10;
	c = a + b;
	System.out.println(c);
	return " ";
}
	
}

 
