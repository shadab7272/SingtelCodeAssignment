package com.test.singtel.sectionA;

import com.test.singtel.interfaces.Birds;

public class Rooster implements Birds {

	String sound;
	
	public Rooster(String sound){
		this.sound = sound;
	}
	public void sound(){
		System.out.println("Rooster sounds "+sound);
	}
	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}
	
}
