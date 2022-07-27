package com.empapp.api;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
@Path("api")
public class HelloApi {
	// emp/name/add	/emp?name=raj&add=delhi
	//@PathVariable vs @RequestParam
	
	//@PathParam, @QueryParam--> jersy
	
	//hello2?name=raja&add=delhi
	@GET
	@Path("hello2")
	public String sayHello2(@QueryParam(value = "name") String name,
			@QueryParam(value = "add") String add) {
		return "hello all champs "+ name +" : "+ add;
	}
	
	@GET
	@Path("hello/{groupName}")
	public String sayHello(@PathParam(value = "groupName") String groupName) {
		return "hello all champs "+ groupName;
	}
	
	
//	@GET
//	@Path("hello/{groupName}")
//	public String sayHello(@PathParam(value = "groupName") String groupName) {
//		return "hello all champs ";
//	}
}
