package com.ghsoft.mycar02;

public class Car {
	Tire tire;
	
	public Car(Tire tire) {

		this.tire =  tire;
	}
	
	public String getTireBrand() { return "This is "+ tire.getBrand();}
	
}
