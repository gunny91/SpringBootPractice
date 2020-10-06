package com.ghsoft.coffee2;


public class CoffeeMain {

	public static void main(String[] args) {
		HotAmericano hot = new HotAmericano();
		IceAmericano ice = new IceAmericano();
		
		Coffee c = new Coffee(ice);
		c.coffeeType();

	}

}
