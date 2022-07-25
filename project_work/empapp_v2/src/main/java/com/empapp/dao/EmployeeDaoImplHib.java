package com.empapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.empapp.exceptions.EmployeeNotFoundException;
import com.empapp.util.EmfFactory;

public class EmployeeDaoImplHib implements EmployeeDao {

	private EntityManagerFactory emf;

	public EmployeeDaoImplHib() {
		emf = EmfFactory.getEntityManagerFactory();
	}

	@Override
	public List<Employee> getAll() {
		System.out.println("-------hibernate wala dao layer----------");
		EntityManager em = emf.createEntityManager();
		List<Employee> employees = em.createQuery("select e from Employee e", Employee.class).getResultList();
		em.close();
		return employees;
	}

	@Override
	public Employee getById(int id) {

		EntityManager em = emf.createEntityManager();
		Employee employee = em.find(Employee.class, id);
		em.close();
		if(employee==null)
			throw new EmployeeNotFoundException("emp with "+ id+" is not found");
		return employee;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		EntityManager em = emf.createEntityManager();
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
		return employee;
	}

	@Override
	public Employee updateEmployee(int id, double salary) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		Employee empToUpdate=null;
		try {

			tx.begin();
			 empToUpdate=em.find(Employee.class, id);
			empToUpdate.setSalary(salary);
			em.merge(empToUpdate);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}

		em.close();
		return empToUpdate;
	}

	@Override
	public void deleteEmployee(int id) {
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		try {

			tx.begin();
			Employee empToDelete=getById(id);
			em.remove(empToDelete);
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}

		em.close();
	}

}




