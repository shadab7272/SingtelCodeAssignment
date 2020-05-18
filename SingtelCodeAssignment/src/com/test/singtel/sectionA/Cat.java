package com.test.singtel.sectionA;

import com.test.singtel.interfaces.Birds;

public class Cat implements Birds{
	
	String sound;
	
	public Cat(String sound){
		this.sound = sound;
		sound();
	}
	public void sound(){
		System.out.println("Cat sounds "+sound);
	}
	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}

}
