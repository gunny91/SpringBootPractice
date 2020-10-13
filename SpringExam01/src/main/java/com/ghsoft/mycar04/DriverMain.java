package com.ghsoft.mycar04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/ghsoft/mycar04/appCtx.xml");
		
		Car car = ctx.getBean("car", Car.class);
		Tire tire = ctx.getBean("tire",Tire.class);
		
		car.setTire(tire);
		System.out.println(car.getTireBrand());
	}

}
