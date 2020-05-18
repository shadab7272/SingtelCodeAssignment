package com.test.singtel.interfaces;
@FunctionalInterface
public interface Animal extends AnimalInterface{

	default void walk(){
		System.out.println("Animal is walking");
	}
	default void fly(){
		System.out.println("Animal is flying");
	}
	void sing();
}
