package com.ghsoft.mycar06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ghsoft/mycar06/appCtx.xml");
		
		Car car = context.getBean("car",Car.class);
		System.out.println(car.getTireBrand());
		
		
		Titre t = new Tire();
		System.out.println(car.getTireBrand());
	}

}
