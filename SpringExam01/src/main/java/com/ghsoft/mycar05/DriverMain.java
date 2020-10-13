package com.ghsoft.mycar05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ghsoft/mycar05/appCtx.xml");
		
		Car car = context.getBean("car", Car.class);
		System.out.println(car.getTireBrand());

	}

}
