package com.day1.session2.ex6;

import java.util.Optional;

public class DemoOptionalBasics {
	
	public static void main(String[] args) {
		String name=null;
		Optional<String> optString= Optional.ofNullable(name);
		
		//dont use such king of code!
		if(optString.isPresent()) {
			
		}
		
		//System.out.println(optString.orElse("name is not found"));
		
		System.out.println("----------");
		
		//System.out.println(optString.orElseThrow(()-> new RuntimeException()));
		
		//System.out.println(optString.orElseThrow(RuntimeException::new));
	}

}
