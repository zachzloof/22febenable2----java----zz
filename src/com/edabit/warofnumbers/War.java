package com.edabit.warofnumbers;

public class War {
	public int battle (int[] input) {
		int a = 0;
		int b = 0;
		int c = 0;
		int y = input.length;
		for (int i = 0; i < y; i ++) {
			c = input[i] % 2;
			if (c == 0) {
				a += input[i];
			} else {
				b += input[i];
			}
		}
		a = a - b;
		if (a < 0) {
			a *= -1;
			System.out.println("Odds won this round! \n----------------");
		} else {
			System.out.println("Evens won this round! \n----------------");
		}
		return a;
	}

}
