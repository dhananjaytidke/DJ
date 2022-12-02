package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.serviceimpl.Serviceimpl;

@RestController
public class EmployeeController {
	
	@Autowired
	private Serviceimpl ser;
	
	@PostMapping("/saves")
	public Employee save(@RequestBody Employee employee)
	{
		return ser.saveEmployee(employee);
	}
	
	@PutMapping("/updates")
	public Employee update(@RequestBody Employee employee)
	{
		return ser.updateEmployee(employee);
	}
	
	@DeleteMapping("/deletes/{empid}")
	public void delete(@PathVariable(value = "empid",required = true) int empid)
	{
		ser.deleteEmployee(empid);
	}
	
	@GetMapping("/all")//get all employee details
	public List<Employee> getall()
	{
		return ser.getall();
	}

}

