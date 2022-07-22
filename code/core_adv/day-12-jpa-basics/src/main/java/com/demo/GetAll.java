package com.demo;
import java.util.*;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class GetAll {

	public static void main(String[] args) {
		//EntityManagerFactory
		//EntityManager
		
		//remember if i need to change the state of db then i have to start the tx myself :/ 
		//spring can help u latter on
//		em.getTransaction().begin();
//		
//		em.getTransaction().commit();
		//SQL ==> JPQL or HQL (hibernate Query langauge)
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("kronos_pu");
		
		EntityManager em=emf.createEntityManager();

		System.out.println(em);
		List<Employee> employees=em
				.createQuery("select e from Employee e", Employee.class)
				.getResultList();
		System.out.println(em);
		employees.forEach(e-> System.out.println(e));
		
		em.close();
		
		emf.close();
		
		
		
	}
}
