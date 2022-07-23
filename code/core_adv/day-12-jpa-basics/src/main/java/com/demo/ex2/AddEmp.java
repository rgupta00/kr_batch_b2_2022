package com.demo.ex2;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddEmp {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kronos_pu");

		EntityManager em = emf.createEntityManager();

		// i want to save a employee object

		Employee employee = new Employee("ramesh", 59000);

		employee.setDataOfBith(new Date());
		employee.setEmpType(EmpType.DEV);
		employee.addPhone("7655676776");
		employee.addPhone("7650076776");
		employee.setTempPassword("fdfgf#122");
		
		EntityTransaction tx = em.getTransaction();
		try {

			tx.begin();
			
			em.persist(employee);
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}

		em.close();
		emf.close();

	}

}
