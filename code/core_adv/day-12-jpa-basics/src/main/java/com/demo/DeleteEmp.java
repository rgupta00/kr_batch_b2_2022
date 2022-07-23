package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteEmp {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kronos_pu");

		EntityManager em = emf.createEntityManager();

		// i want to save a employee object

		
		EntityTransaction tx = em.getTransaction();
		try {

			tx.begin();
			Employee empToDelete=em.find(Employee.class, 7);
			em.remove(empToDelete);
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}

		em.close();
		emf.close();

	}

}
