package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.modal.Employee;


public interface EmployeeService {

	public Employee addEmp(Employee e);
	
	public List<Employee> getAllEmployee();
	
	public Optional<Employee> findById(int id);
	
	public void delete(Optional<Employee> e);
	
	



	
}
