package com.test.singtel.sectionA;

import com.test.singtel.interfaces.Birds;

public class Chicken implements Birds {

	String sound;
	
	Rooster rooster;
	
	public Chicken(String sound, Rooster rooster){
		this.sound = sound;
		this.rooster = rooster;
		sound();
	}
	public void sound(){
		System.out.println("Chicken making sound = "+sound+"Rooster making sound = "+rooster.sound);
	}
	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}
}
