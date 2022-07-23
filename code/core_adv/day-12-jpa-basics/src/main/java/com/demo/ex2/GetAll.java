package com.demo.ex2;
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
		
		Employee employee=em
		.createQuery("select e from Employee e where id=:id", Employee.class)
		.setParameter("id", 9)
		.getSingleResult();
		System.out.println("----------------------");
		System.out.println(employee);
		

//		List<Employee> employees=em
//				.createQuery("select e from Employee e", Employee.class)
//				.getResultList();
//		
//		
//		employees.forEach(e-> System.out.println(e));
		
//		List<Object[]> employees=em
//				.createQuery("select e.id, e.salary from Employee e", Object[].class)
//				.getResultList();
//		for(Object[] temp: employees) {
//			System.out.println(temp[0]+": "+ temp[1]);
//		}
//		
//		//employees.forEach(e-> System.out.println(e));
		
		
//		List<EmpData> employees=em
//				.createQuery("select new com.demo.EmpData(e.id, e.name) from Employee e", EmpData.class)
//				.getResultList();
//		employees.forEach(e-> System.out.println(e));
		
		em.close();
		
		emf.close();
		
		
		
	}
}
