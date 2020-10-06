package com.ghsoft.bmi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BMIMain {

	public static void main(String[] args) {
		String conf = "classpath:application.xml";
		
		//Spring Container formed
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(conf);
		
		//Bring the comphonent from Spring Container
		MyInfo myinfo = ctx.getBean("myinfo",MyInfo.class);

	}

}
