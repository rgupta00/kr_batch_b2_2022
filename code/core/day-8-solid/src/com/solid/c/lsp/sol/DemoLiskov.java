package com.solid.c.lsp.sol;

//Rectangle "reuse" Square : Inheritance XXX
class Rectangle {
	private int l, b;

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}

	public int calculateArea() {
		return l * b;
	}

}

class Square  {
	private Rectangle rectangle;
	
	public Square(int l) {
		rectangle=new Rectangle(l, l);
	}
	
	public int calculateArea() {
		return rectangle.calculateArea();
	}
	public void changeDimension(int newDimension) {
		rectangle.setB(newDimension);
		rectangle.setL(newDimension);
	}
}



// dare to misuse my code!


public class DemoLiskov {

	public static void main(String[] args) {
		Square square=new Square(2);
		System.out.println(square.calculateArea());
		square.changeDimension(3);
		System.out.println(square.calculateArea());
	}
}





