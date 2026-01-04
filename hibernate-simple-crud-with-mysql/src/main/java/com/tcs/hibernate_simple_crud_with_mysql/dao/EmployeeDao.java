package com.tcs.hibernate_simple_crud_with_mysql.dao;

import java.util.List;

import com.tcs.hibernate_simple_crud_with_mysql.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class EmployeeDao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public Employee saveEmployeeDao(Employee employee) {
		if(employee==null) {
			return null;
		}
		et.begin();
		em.persist(employee);
		et.commit();
		return employee;
	}
	
	public Employee getEmployeeByIdDao(int empId) {
		return em.find(Employee.class, empId);
	}
	
	public boolean deleteEmployeeByIdDao(int empId) {
		Employee employee=getEmployeeByIdDao(empId);
		
		if(employee==null) {
			return false;
		}
		et.begin();
		em.remove(employee);
		et.commit();
		return false;
	}
	
	public Employee updateEmployeByIdDao(int empId,double salary) {
		Employee employee=getEmployeeByIdDao(empId);
		if(employee==null) {
			return null;
		}
		et.begin();
		employee.setSalary(salary);
		em.merge(employee);
		et.commit();
		return employee;
	}
	
	public List<Employee> getAllEmployeeDao(){
		Query query=em.createQuery("from Employee",Employee.class);
		List<Employee> employees=query.getResultList();
		return employees;
		
	}
	public Employee getEmployeeByEmailDao(String email) {
		Query query=em.createQuery("Select e From Employee e Where e.email=?1",Employee.class);
		query.setParameter(1, email);
		try {
			
		Employee employee=(Employee) query.getSingleResult();
		return employee;
		}catch (NoResultException e){
			e.printStackTrace();
			return null;
			
		}
		
	}
}





