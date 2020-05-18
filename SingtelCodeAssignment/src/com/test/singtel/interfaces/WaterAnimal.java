package com.test.singtel.interfaces;
@FunctionalInterface
public interface WaterAnimal extends AnimalInterface{

	default void walk(){
		System.out.println("Water Animal don't walking");
	}
	default void sing(){
		System.out.println("Water Animal don't singing");
	}
	void swim();
	default void color() {
		
		System.out.println("Water Animal have different color");
	}
	
	default void size() {
		
		System.out.println("Water Animal have different size");
	}
}
