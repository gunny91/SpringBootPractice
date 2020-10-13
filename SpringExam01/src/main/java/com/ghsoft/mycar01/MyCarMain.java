package com.ghsoft.mycar01;

public class MyCarMain {

	public static void main(String[] args) {
		
		KoreanTire k = new KoreanTire();
		k.getBrand();
		
		AmericanTire a = new AmericanTire();
		a.getBrand();
		Car car = new Car();
		
		System.out.println(car.getTireBrand());
		
	}

}
