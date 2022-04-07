package com.ml.zookeeperproject;

public class Gorilla extends Mammal {
//attributes===========================================
	
//constructor =========================================
	
//methods===============================================
	//throwSomething() -> energy decreases by 5
	//eatBananas() ->energy increases by 10
	//climb() -> energy decreases by 10
	public void throwSomething() {
		System.out.println("Gorilla threw a rock and hurt himself");
		
		this.setEnergyLevel(getEnergyLevel()-5);
	}
	
	public void eatBananas() {
		System.out.println("Gorilla feels so great after ate a banana!");
		
		this.setEnergyLevel(getEnergyLevel()+10);
	}
	
	public void climb() {
		System.out.println("Oop, Gorilla climbed the tree and fell!");
		
		this.setEnergyLevel(getEnergyLevel()-10);
	}
	
//getters & setters================================
}
