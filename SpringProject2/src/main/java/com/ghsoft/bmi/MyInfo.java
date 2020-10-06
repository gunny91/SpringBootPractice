package com.ghsoft.bmi;

import java.util.ArrayList;

public class MyInfo {

	private String name;
	private double height;
	private double weight;
	private ArrayList<String> hobby;
	private BMICalculator bmiclass;
	
	public void bmicalculation() {
		bmiclass.bmicalculation(weight, height);
	}
	
	public void getInfo() {
		System.out.println("Name : "+ name);
		System.out.println("Height : "+ height);
		System.out.println("Weight : "+ weight);
		System.out.println("Hobby : "+ hobby);
		bmicalculation();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public ArrayList<String> getHobby() {
		return hobby;
	}

	public void setHobby(ArrayList<String> hobby) {
		this.hobby = hobby;
	}

	public BMICalculator getBmiclass() {
		return bmiclass;
	}

	public void setBmiclass(BMICalculator bmiclass) {
		this.bmiclass = bmiclass;
	}

	
}
