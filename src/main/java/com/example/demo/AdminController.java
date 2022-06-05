package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/Admin")
public class AdminController {

	@Autowired
	private EmployeeService empservice;
	
	@PostMapping("/addDetails")
	public String addemp(@RequestBody Employee emp) {
		empservice.addEmp(emp);
		
		return "added emp data";
		
	}
	
	@GetMapping("/Alldetails")
	public List<Employee> getalldetails() {
		return empservice.getAllEmployee();
		
	}
	
	@GetMapping("/details/{id}")
	public Optional<Employee> getempByid(@PathVariable int id){
		Optional<Employee> e= empservice.findById(id);
		return e;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteemp(@PathVariable int id) {
		Optional<Employee> e= empservice.findById(id);
		empservice.delete(e);
	}
	
	
	
}
