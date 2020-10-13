package com.ghsoft.mycar05;



public class Car {
	
	/**
	 * Instance variable for tire
	 */
	public Tire tire;
	
	
	public Tire getTire() { return tire;}

	public void setTire(Tire tire) {this.tire=tire;}
	
	public String getTireBrand() {return "This is from "+ tire.getBrandName();}
}
