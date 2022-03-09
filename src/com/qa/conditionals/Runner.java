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
		double wage = 30000;
		System.out.println(game3.methodOne(wage));
		System.out.println(game3.methodTwo(wage));
    }
		
}
