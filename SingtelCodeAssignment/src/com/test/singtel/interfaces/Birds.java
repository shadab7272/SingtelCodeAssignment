package com.test.singtel.interfaces;

public interface Birds extends Animal{
	
	 default void sound(){
		System.out.println("Birds will make sound");
	}
	 default void swim(){
			System.out.println("Birds will make sound");
		}

}
