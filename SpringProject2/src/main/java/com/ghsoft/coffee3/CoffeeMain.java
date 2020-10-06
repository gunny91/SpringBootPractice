package com.ghsoft.coffee3;

public class CoffeeMain {

	public static void main(String[] args) {
		
		Coffee c = new Coffee();
		IceAmericano ice = new IceAmericano();
		c.setCoffee(ice);
		
		c.getName();

	}

}
