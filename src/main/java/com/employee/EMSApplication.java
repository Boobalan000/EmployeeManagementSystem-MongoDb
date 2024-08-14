package com.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.repository.Employee_Repository;

@SpringBootApplication
public class EMSApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EMSApplication.class, args);
	}

	@Autowired 
	private Employee_Repository emp_repo;
	
	@Override
	public void run(String... args) throws Exception {
		//System.out.println(emp_repo.findAll());
		System.out.println(emp_repo.getEmployeeById(0));
		
	}

}
