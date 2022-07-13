package com.b.innerclasses;
 class Outer{
	 class Inner{ 
		 void doInner() {
			 System.out.println("do inner method ");
		 }
	 }
	 //u cant create the object of inner class in the outers static method
	 public static void doOuterStatic() {
//		 Inner inner=new Inner();
//		 inner.doInner();
	 }
	 
	 //this
	 public void doOuter() {
		 Inner inner=this.  new Inner();
		 inner.doInner();
	 }
}
public class A_TopLevelInnerClass {

	public static void main(String[] args) {
		//u cant create object of inner class without valid object of outer class
		//outside the outer class
//		Outer.Inner inner=new Outer().new Inner();
//		inner.doInner();
		Outer o=new Outer();
		Outer.Inner in=o. new Inner();
		
	}
}
