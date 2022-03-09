package com.qa.conditionals;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean isLightOn = false;

//        if(isLightOn) {
//            System.out.println("The light is turned on");
//        } else {
//            System.out.println("The light is turned off");
//        }

//		BlackJack game1 = new BlackJack();
//		System.out.println(game1.blackJackMethod(15, 17));

//		UniqueSum game2 = new UniqueSum();
//		System.out.println(game2.uniqueSumMethod(3, 3 ,3));

		Tax game3 = new Tax();
		//System.out.println(game3.methodOne());
		//System.out.println(game3.methodThree(50000));
		//System.out.println(game3.takeHome());
		FizzBuzz game4 = new FizzBuzz();
		System.out.println(game4.methodOne(15));
	}

}
