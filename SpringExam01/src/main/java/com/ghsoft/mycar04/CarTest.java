package com.ghsoft.mycar04;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ghsoft.mycar03.Car;
import com.ghsoft.mycar03.KoreanTire;
import com.ghsoft.mycar03.Tire;

public class CarTest {

	@Test
	public void testTire() {
		Tire tire1 = new KoreanTire();
		Car car1 = new Car();
		car1.setTire(tire1);
		assertEquals("This is tire from Korean Tire",car1.getTireBrand());
		System.out.println(car1.getTireBrand());
	}
}
