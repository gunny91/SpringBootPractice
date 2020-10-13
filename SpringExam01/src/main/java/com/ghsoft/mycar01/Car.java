package com.ghsoft.mycar01;

public class Car {

	private Tire tire;
	
	
	public Car() {
		//AmericanTire at = new AmericanTire();
		this.tire = new KoreanTire();
	}

	public String getTireBrand() {
		return "Current Tire is " +tire.getBrand() ;
		
	}
}
