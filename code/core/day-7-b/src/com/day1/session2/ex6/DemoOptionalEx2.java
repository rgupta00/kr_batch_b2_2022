package com.day1.session2.ex6;

import java.util.Optional;

public class DemoOptionalEx2 {

	public static void main(String[] args) {
		
		
		
	Optional<String> nameOpt = EmpApi.nameOfEmp(44);
	
//	String name=nameOpt.orElse("name is not found");
//	System.out.println(name);
	
	String name=nameOpt.orElseThrow(()-> new EmpNotFoundException());
	System.out.println(name);

	}

}
