package com.app.demo.examples;

public class Car {

	private String name = "Ferrari";
	private int model = 488;
	private String color = "red";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "car [name=" + name + ", model=" + model + ", color=" + color + "]";
	}
	
}
