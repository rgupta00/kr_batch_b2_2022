package com.empapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//we have just declare the dao layer .. dont have define any method , that is impl by JpaRepository
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
