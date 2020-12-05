package com.app.demo.model;

public class DOg implements Animal {

	public void bark() {
		System.out.println("dog barking");
	}
	
	@Override
	public String walk() {
		String action = "dog walking";
		System.out.println(action);
		return action;
	}
}
