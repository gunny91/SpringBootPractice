package com.ghsoft.coffee3;

public class Coffee {

	private Americano americano;
	
	public Coffee() {
	}
	
	public void setCoffee(Americano americano) {this.americano =americano;}
	
	public void getName() {
		System.out.println(americano.getName());
	}
}
