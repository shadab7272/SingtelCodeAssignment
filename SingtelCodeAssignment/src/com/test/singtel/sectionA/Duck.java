package com.test.singtel.sectionA;

import com.test.singtel.interfaces.Birds;

public class Duck implements Birds {
	
	public  Duck(){
		sound();
		swim();
	}

	public void sound(){
		System.out.println("Duck making sound Quack Quack");
	}

	public void swim() {
		System.out.println("Duck making can Swim");
		
	}

	@Override
	public void sing() {
		System.out.println("Duck making cannot Sing");
		
	}
}
