package com.ghsoft.coffee2;

public class Coffee {

	
	private Aemricano americano;
	
	public Coffee(Aemricano coffee) {
		americano = coffee;
	}
	
	public void coffeeType() {
		System.out.println(americano.getName());
	}
}
