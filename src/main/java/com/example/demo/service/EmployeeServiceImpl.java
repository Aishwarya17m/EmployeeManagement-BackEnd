package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Employee;

import com.example.demo.repo.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository emprepo;
	 
	@Override
	public Employee addEmp(Employee e) {
		// TODO Auto-generated method stub
	
		
	return emprepo.save(e);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

	@Override
	public 	Optional<Employee> findById(int id) {
		// TODO Auto-generated method stub
	return emprepo.findById(id);

		
	}

	@Override
	public void delete(	Optional<Employee> e) {
		// TODO Auto-generated method stub
		emprepo.deleteById(e.get().getEmp_id());
	}

	

	

}
