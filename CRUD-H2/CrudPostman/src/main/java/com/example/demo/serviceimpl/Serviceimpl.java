package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.Serviceinter;


@Service
public class Serviceimpl implements Serviceinter{
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	@Override
	public void deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		repo.deleteById(empid);
		
	}

	@Override
	public List<Employee> getall() {
		// TODO Auto-generated method stub
		return (List<Employee>) repo.findAll();
	}

}
