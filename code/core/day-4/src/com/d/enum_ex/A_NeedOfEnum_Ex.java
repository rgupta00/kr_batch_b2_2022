package com.d.enum_ex;
//S(38), M(40), L(42), XL(44), XXL(46);

class Shirt {
	private String color;
	private int size;
	private double price;

	public Shirt() {
	}

	public Shirt(String color, int size, double price) {
		this.color = color;
		this.size = size;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Shirt [color=").append(color).append(", size=").append(size).append(", price=").append(price)
				.append("]");
		return builder.toString();
	}

}

public class A_NeedOfEnum_Ex {
	public static void main(String[] args) {

		Shirt shirt = new Shirt("red", 40, 1500.00);
		System.out.println(shirt);
	}
}
