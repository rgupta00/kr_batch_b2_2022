package com.day1.session2.ex3;
class AppleHelper{
	public static boolean isHeavy(Apple apple) {
		return apple.getWeight()>=300;
	}
}
public class Apple {
	private String color;
	private int weight;

	public boolean isHeavy() {
		return weight>=300;
	}

	public boolean isGeeen() {
		return color.equals("green");
	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Apple(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}

	public Apple() {
	}

}