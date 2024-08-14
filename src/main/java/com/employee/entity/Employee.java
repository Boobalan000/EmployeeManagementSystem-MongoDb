package com.employee.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id 
    private String id_mongodb;
	
	private int id;
	private String name;
	private String email;
	private String location;
	
		
	
	
}
