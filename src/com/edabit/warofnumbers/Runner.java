package com.edabit.warofnumbers;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] soldiers = {10, 20, 30, 50, 257};
		
		War myBattle = new War();
		System.out.println(myBattle.battle(soldiers));
	}

}
