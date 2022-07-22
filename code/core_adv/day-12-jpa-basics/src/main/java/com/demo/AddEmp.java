package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddEmp {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kronos_pu");

		EntityManager em = emf.createEntityManager();
		
		//i want to save a employee object
		
		Employee employee=new Employee("ganesh", 59000);
		
		em.getTransaction().begin();
		
		em.persist(employee);
		
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}
