package com.employee.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.employee.entity.*;

public interface Employee_Repository extends MongoRepository<Employee,String>{

	@Query("{'id':?0}")
	List<Employee> getEmployeeById(int id);
	
}