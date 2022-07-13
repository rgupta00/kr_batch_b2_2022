package com.b.innerclasses;
//---top level inner class----

//---why inner class?
//class A{
//	class B{
//		
//	}
//}

//---method local inner class--
//class A {
//	public void foo() {
//
//		class B {
//
//		}
//	}
//}

//anymous inner class : having no name
class Outer {
	private int i = 77;

	 class Inner {
		private int i = 66;

		public void fooInner() {
			System.out.println(Outer.this.i);
//			System.out.println(Outer.i);
		}
	}
//	 //static method dont have this
//	static public void foo() {
//		//Why ?
//		Inner inner=new Inner();
//		inner.fooInner();
//	}
}

public class DemoInnerClass {

	public static void main(String[] args) {

		Outer.Inner inn = new Outer().new Inner();// u can not crate object of inner class without haveing object of outer class
		inn.fooInner();
	}
}
