package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddEmp {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kronos_pu");

		EntityManager em = emf.createEntityManager();

		// i want to save a employee object

		Employee employee = new Employee("nitin gupta", 59000);

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
