package com.ghsoft.mycar02;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {



	@Test
	public void testGetTireBrand() {
		Tire tire = new KoreanTire();
		Car car = new Car(tire);
		assertEquals("This is 한국 타이어",car.getTireBrand());
	}

	
	@Test
	public void testGetTireBrand2() {
		Tire tire = new AmericanTire();
		Car car = new Car(tire);
		assertEquals("This is 미국타이어",car.getTireBrand());
	}
}
