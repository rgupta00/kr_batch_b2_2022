package com.day3.session1.c.interface_break_hierarchy2;

public class EmployeePaymentProceseingSystemTester {

	public static void main(String[] args) {
	//	Employee employee=new FullTimeEmployee(2, "raj", 700000);
		
//		Payable employee=new PartTimeEmployee(2, "raj", 7000, 10,23);
		
		Payable payable=new Invoice("rajeev gupta", 30000, 23);
		
		EmployeePaymentProceseingSystem.employeePaymentProceseingSystem(payable);

		

	}

}
