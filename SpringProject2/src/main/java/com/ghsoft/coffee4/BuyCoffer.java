package com.ghsoft.coffee4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BuyCoffer {
	public static void main(String[] args) {
//		Coffee coffee = new Coffee();
//		coffee.coffeeType();
		
		ApplicationContext factory = new GenericXmlApplicationContext("classpath:com/ghsoft/coffee4/appl.xml");
		Coffee c = factory.getBean("coffee", Coffee.class);
		c.coffeeType();
		
		((GenericXmlApplicationContext) factory).close();
		//The GenericXmlApplicationContext class 
		//extend GenericApplicationContext -> extend AbstractApplicationContext,
		//such that we can use close() method from AbstractApplicationContext
	}
}
