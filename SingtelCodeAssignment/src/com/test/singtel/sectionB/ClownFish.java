package com.test.singtel.sectionB;

import com.test.singtel.interfaces.WaterAnimal;

public class ClownFish implements WaterAnimal {
	
	public ClownFish() {
		
		swim();
		size();
		 color() ;
		 features();
	}

	public void swim() {

		System.out.println("ClownFish can swim");
	}

	public void color() {

		System.out.println("ClownFish is in orange Color");
	}

	public void size() {

		System.out.println("ClownFish are small");
	}

	public void features() {

		System.out.println("ClownFish makes jokes");
	}
}