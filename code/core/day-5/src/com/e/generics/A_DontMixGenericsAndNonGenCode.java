package com.e.generics;
import java.util.*;
public class A_DontMixGenericsAndNonGenCode {

	public static void main(String[] args) {
		//Generics is a compile time safty net, dont avaible to JVM
		
		//MIXING OF wine with water is ok
		//MIXING OF wine with milk is not ok (Dont mix generics and non gnerics code togather)
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(44);
		list.add(4);
		list.add(64);
		list.add(7);
		
		System.out.println(list);
		
		strangeMethod(list);
		
	
	}

	//:( we have to be careful!
	private static void strangeMethod(List list) {
		
	}
}











