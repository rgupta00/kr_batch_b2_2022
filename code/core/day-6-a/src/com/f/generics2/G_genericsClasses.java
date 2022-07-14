package com.f.generics2;

//how to write generics class with ease...?
class Foo<T> {
	private T i;

	public T getI() {
		return i;
	}

	public void setI(T i) {
		this.i = i;
	}

}

public class G_genericsClasses {

	public static void main(String[] args) {

		Foo<Double> f2 = new Foo<>();
		f2.setI(44.00);
		System.out.println(f2.getI());

		Foo<Integer> f = new Foo<>();
		f.setI(44);
		System.out.println(f.getI());
	}

}
