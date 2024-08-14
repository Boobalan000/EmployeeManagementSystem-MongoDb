package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.employee.entity.Employee;
import com.employee.service.Employee_Service;



@Controller
public class Employee_Controller {

	@Autowired
	private Employee_Service employee_service;
	
	@GetMapping("/")
	public String formPage(Model model)
	{
		Employee employee=new Employee();
		model.addAttribute("employee",employee);
		return "index";
	}
	
	@PostMapping("/")
	public String saveEmployee(@ModelAttribute("employee")Employee employee)
	{
		employee_service.saveEmployee(employee);
		return "redirect:/";
	}
	
	@GetMapping("/displayAll")
	public String displayAll(Model model)
	{
		model.addAttribute("employee",employee_service.getAllEmployee());
		return "display";
	}
	
	@GetMapping("/display/{id}")
	public String displaySingle(@PathVariable int id,Model model)
	{
		model.addAttribute("employees",employee_service.getEmployeeById(id));
		return "employee";
	}
	
	
}
