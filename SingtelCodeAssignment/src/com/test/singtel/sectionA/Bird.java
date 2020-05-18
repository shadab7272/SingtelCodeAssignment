package com.test.singtel.sectionA;

import com.test.singtel.interfaces.Birds;

public class Bird implements Birds {
	
	public Bird() {
		
		fly();
		sing();
	}

	public void fly() {
		System.out.println("Bird is flying");
	}

	public void sing() {
		System.out.println("Bird is singing");
	}
}