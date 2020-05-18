package com.test.singtel.interfaces;
@FunctionalInterface
public interface Flyers extends AnimalInterface{

	default void walk(){
		System.out.println("Flyers can walk");
	}
	 default void sound(){
		System.out.println("Flyers dont have sound");
	}
	void fly();
	
}
