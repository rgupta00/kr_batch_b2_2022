package com.f.generics2;
//how to write generics class with ease...?

class MyClass<T1,T2>{
	private T1 i;
	private T2 j;
	
	public T1 getI() {
		return i;
	}
	public void setI(T1 i) {
		this.i = i;
	}
	public T2 getJ() {
		return j;
	}
	public void setJ(T2 j) {
		this.j = j;
	}

}
public class G_genericsClasses {
	
	public static void main(String[] args) {
		MyClass<Integer,String> class1=new MyClass<>();
		class1.setI(22);
		System.out.println(class1.getI());
	}

}
