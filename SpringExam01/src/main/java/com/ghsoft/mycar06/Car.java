package com.ghsoft.mycar06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	@Autowired
	private Tire tire;
	
	@Autowired
	@Qualifier("ame")
	private Tire ameTire;
	public String getTireBrand() {return "The tire is from " +tire.getBrand();}
}
