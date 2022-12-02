package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface Serviceinter {
	
	public Employee saveEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee);
	
	public void deleteEmployee(int empid);
	
	public List<Employee> getall();
	
	

}
