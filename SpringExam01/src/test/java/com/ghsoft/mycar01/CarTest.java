package com.ghsoft.mycar01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void Cartest() {
		System.out.println("Working?");
		Car car = new Car();
		assertEquals("Fuck", car.getTireBrand(), "Must to be somethinfg");
	}

}
