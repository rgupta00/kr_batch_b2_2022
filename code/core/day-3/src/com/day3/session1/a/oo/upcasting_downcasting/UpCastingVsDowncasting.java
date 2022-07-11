package com.day3.session1.a.oo.upcasting_downcasting;

class A {
}

class B extends A {
}

class C extends A {
}

public class UpCastingVsDowncasting {

	public static void main(String[] args) {
		// --------- upcasting
		A a1 = new B();
		A a2 = new C();

//		B b1=(B) a1;//forcefully doing it

		// instanceof opeator worked at run

		if (a2 instanceof B) {
			B b1 = (B) a2;
		} else
			System.out.println("not a compatble type: dont compare apple with orange");

		System.out.println("----------");

	}
}
