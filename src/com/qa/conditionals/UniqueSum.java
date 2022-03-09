package com.qa.conditionals;

public class UniqueSum {
	
	public int uniqueSumMethod(int a, int b, int c){
		int answer = 0;
		if (a != b && a != c && b != c) {
			answer = a + b + c;
		} else if (a == b && a == c) {
			answer = 0;
		} else if (a == b) {
			answer = c;
		} else if (b == c) {
			answer = a;
		}else if (a == c) {
			answer = b;
		} 
		return answer;
	}
}
