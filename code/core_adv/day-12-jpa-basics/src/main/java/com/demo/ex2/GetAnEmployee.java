package com.demo.ex2;
import java.util.*;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class GetAnEmployee {

	public static void main(String[] args) {
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("kronos_pu");
		
		EntityManager em=emf.createEntityManager();

		Employee employee=em.find(Employee.class, 4);
		System.out.println(employee);

		Employee employee2=em.find(Employee.class, 4);
		System.out.println(employee2);
		
		em.close();
		
		emf.close();
		
		
		
	}
}
