package com.ghsoft.mycar04;

public class Car {

	Tire tire;
	
	public Tire getTire() { return tire;}

	public void setTire(Tire tire) {this.tire=tire;}
	
	public String getTireBrand() {return "This is tire from "+ tire.getBrand();}

}
