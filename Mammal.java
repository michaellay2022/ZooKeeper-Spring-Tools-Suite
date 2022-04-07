package com.ml.zookeeperproject;

public class Mammal {
	
	
	//attribute
	private int energyLevel = 100;
	
	
	//constructor ==============================================

	public Mammal() {
		
	}
	
	
	public Mammal(int energyLevel) {
		
		this.energyLevel = energyLevel;
	}
	
	


	//methods=====================================================
	//displayEnergy()
	//this displayEnergy() should show the animal's energy level as well as return it
	
	
	
	//getters & setters =========================================
	


	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
