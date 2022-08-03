package com.empapp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

	//@PathVariable vs @RequestParam ?
	
	//http://localhost:8090/hello2?uname=raj&address=mp
	
	@GetMapping(path = "hello2")
	public String hello2(@RequestParam(name = "uname") String uname,
			@RequestParam(name="address", defaultValue = "india", required = false) String address) {
		return "hello to champ: "+uname +" and your state is "+ address;
	}
	
	
	//http://localhost:8090/hello/amit
	@GetMapping(path = "hello/{uname}")
	public String hello(@PathVariable(name = "uname") String name) {
		return "hello to champ: "+name;
	}
}
