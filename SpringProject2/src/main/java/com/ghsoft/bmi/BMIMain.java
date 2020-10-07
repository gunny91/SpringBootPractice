package com.ghsoft.bmi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BMIMain {

	public static void main(String[] args) {
		String conf = "classpath:application.xml";
		//스프링 컨테이너가 형성됨.
		AbstractApplicationContext ctx 
			= new GenericXmlApplicationContext(conf);
		
		//스프링 컨테이너에서 컴포넌트를 가져온다.
		MyInfo myinfo = ctx.getBean("myInfo", MyInfo.class);
		System.out.println("MYinfo is "+myinfo.toString());
		myinfo.getInfo();
		
		//스프링 컨테이너를 종료한다.
		ctx.close();
	}
}
