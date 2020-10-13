package com.ghsoft.mycar02;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car(new KoreanTire());
		System.out.println(car.getTireBrand());
		
		Car c = new Car(new AmericanTire());
		System.out.println(c.getTireBrand());
		
	}

}
