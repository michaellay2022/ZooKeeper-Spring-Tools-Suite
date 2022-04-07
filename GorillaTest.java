package com.ml.zookeeperproject;

public class GorillaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instantiate a gorilla and have it throw 3 things, eat banana 2x, and 1x climb
		Mammal mammal = new Mammal();
		Gorilla gorilla = new Gorilla();
		
		
		System.out.println("Gorilla's default energy level is" + " " + gorilla.getEnergyLevel());
		
		gorilla.throwSomething();
		System.out.println("Now, his energy levelis" + " " + gorilla.getEnergyLevel());
		
		gorilla.eatBananas();
		System.out.println("Gorilla's energy level now is" + " " + gorilla.getEnergyLevel());

		gorilla.climb();
		System.out.println("Now, his energy level is" + " " + gorilla.getEnergyLevel());
		

	}

}
