package com.demo_object_class;

public class ObjectClassMethods {

	public static void main(String[] args) {

		// com.demo_object_class.Employee@1e81f4dc

		Employee employee1 = new Employee(1, "raj", 90000000);

		Employee employee2 = new Employee(1, "raj", 90000000);

		if (employee1.equals(employee2)) {
			System.out.println("eq");
		} else {
			System.out.println("not eq");
		}

		// System.out.println(employee.toString());
	}

}
