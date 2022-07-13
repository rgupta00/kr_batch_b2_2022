package com.demo_object_class.clone_method;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoClonning {

	public static void main(String[] args) throws CloneNotSupportedException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		Date date = fmt.parse("11/11/1975");

		Employee employee = new Employee(11, "raj", 80000, date);
		// Employee employee2=new Employee(employee);

		Employee employee2 = (Employee) employee.clone();

		System.out.println(employee);
		System.out.println(employee2);
		employee.getDate().setDate(22);
		employee.setName("ravi");
		System.out.println("---------------------");

		System.out.println(employee);
		System.out.println(employee2);

	}
}
