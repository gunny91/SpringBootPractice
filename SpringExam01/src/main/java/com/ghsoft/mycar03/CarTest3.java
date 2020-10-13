package com.ghsoft.mycar03;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest3 {

	@Test
	public void testTire() {
		Tire tire1 = new KoreanTire();
		Car car1 = new Car();
		car1.setTire(tire1);
		assertEquals("This is tire from Korean Tire",car1.getTireBrand());
		System.out.println(car1.getTireBrand());
	}
	
	/**
	 * To do checking for the American tire
	 */
	@Test
	public void testTire2() {
		Tire tire2 = new AmericanTire();
		Car car2 = new Car();
		car2.setTire(tire2);
		assertEquals("This is tire from American Tire",car2.getTireBrand());
		System.out.println(car2.getTireBrand());
	}

}
