package com.qa.conditionals;

public class BlackJack {
	public int blackJackMethod(int p1, int p2) {
		int x;
		int y;
		if(p1 > 0 && p1 <= 21) {
            x = p1;
        } else {
           x = 0;
        }
		if(p2 > 0 && p2 <=21) {
			y = p2;
		} else {
			y = 0;
		}
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}

}
