package com.ghsoft.coffee4;

public class Coffee {
	private HotAmericano ame;
	
	public Coffee() {
		ame = new HotAmericano();
	}
	public void coffeeType() {
		System.out.println(ame.getName());
	}
}



