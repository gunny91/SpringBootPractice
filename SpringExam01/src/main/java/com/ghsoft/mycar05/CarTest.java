package com.ghsoft.mycar05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;



//@ExtendWith(SpringExtension.class)
@ContextConfiguration("appCtx.xml")
class CarTest {
    @Autowired
    Car car;
	
	
	@Test
	public void test() {
		Car car =new Car();
		assertEquals("", car.getTireBrand());
	}

}
