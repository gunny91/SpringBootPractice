package com.ghsoft.bmi;

public class BMICalculator {

	
	private double lowWeight;
	private double normal;
	private double overWeight;
	private double obesty;

	
	public void bmicalculation(double weight, double height) {
		double h = height * 0.01;
		double result = weight/(h*h);
		System.out.println("BMI rate : " + (int)result);
		
		if(result > obesty) {System.out.println("Obesty");}
		else if(result > overWeight) {System.out.println("Over Weight!");}
		else if (result > normal) {System.out.println("Normal");}
		else {System.out.println("Get some milk");}
	}
	
	
	
}
