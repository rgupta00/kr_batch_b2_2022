package com.a.doubts;
class X{	
}
class Y extends  X{	
}
class A{
	public X foo() {
		return new X();
	}
}

class B extends A{
	
	public Y foo() {
		return new Y();
	}
}

public class CovarientRetrunType {
	
	public static void main(String[] args) {
		
	}

}
