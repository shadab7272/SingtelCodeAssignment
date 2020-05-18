package com.test.singtel.sectionB;

import com.test.singtel.interfaces.WaterAnimal;

public class Fish implements WaterAnimal {
	public Fish() {
		
		swim();
		size();
		 color() ;
	}

	public void swim() {

		System.out.println("Fish can swim");
	}

	public void color() {

		System.out.println("Fish have different color");
	}

	public void size() {

		System.out.println("Fishes have different size");
	}
}