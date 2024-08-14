package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.Employee_Repository;

@Service
public class Employee_Service {

	@Autowired
	private Employee_Repository employee_repo;
	
    public Employee saveEmployee(Employee employee)
	{
		return employee_repo.save(employee);
	}
    
    public List<Employee> getAllEmployee()
    {
    	return employee_repo.findAll();
    }
    
    public List<Employee> getEmployeeById(int id)
    {
    	return employee_repo.getEmployeeById(id);
    }
}
