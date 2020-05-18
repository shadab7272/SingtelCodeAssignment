package com.test.singtel.sectionA;

import com.test.singtel.interfaces.Birds;

public class Dog implements Birds{
	
	String sound;
	
	public Dog(String sound){
		this.sound = sound;
		sound();
	}
	public void sound(){
		System.out.println("Dog sounds "+sound);
	}
	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}
	
}

