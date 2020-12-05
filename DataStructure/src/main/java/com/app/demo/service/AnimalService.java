package com.app.demo.service;

import com.app.demo.model.Cat;
import com.app.demo.model.DOg;

public class AnimalService {
	public void makeCatMeowAndWalk() {
		Cat cat = new Cat();
		cat.meow();
		cat.walk();
		cat.running();
	
	}
	public void makeDogBarkAndWalk() {
		DOg dog = new DOg();
		dog.bark();
		dog.walk();
	}
}
