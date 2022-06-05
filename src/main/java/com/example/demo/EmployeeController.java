package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modal.Employee;
import com.example.demo.modal.Login;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.LoginService;


@RestController
@RequestMapping("/Employee")
public class EmployeeController {

	
	@Autowired
	private EmployeeService empservice;
	
	@Autowired
	private LoginService lservice;
	
	@PostMapping("/register")
	public String addemp(@RequestBody Employee emp) {
		empservice.addEmp(emp);
		Login l=new Login();
		l.setEmp(emp);
		l.setEmail(emp.getEmp_email());
		l.setPassword(emp.getPassword());
		lservice.login(l);
		return "registration completed! login to view details";
		
	}
	
//	@PutMapping("/update/{id}")
//	public String updateemp(@PathVariable int id,@RequestBody Employee emp) {
//		Optional<Employee> e=empservice.findById(id);
//		Employee emp1=e.get();
//		 
//		emp1.setAddress(emp.getAddress());
//		emp1.setDesignation(emp.getDesignation());
//		emp1.setDob(emp.getDob());
//		emp1.setEmp_email(emp.getEmp_email());
//		emp1.setEmp_id(emp.getEmp_id());
//		emp1.setEmp_name(emp.getEmp_name());
//		emp1.setPassword(emp.getPassword());
//		emp1.setPhno(emp.getPhno());
//		Login l=new Login();
//		l.setEmp(emp);
//		l.setEmail(emp.getEmp_email());
//		l.setPassword(emp.getPassword());
//		lservice.login(l);
//		empservice.addEmp(emp);
//		
//		return "updated emp data";
//	}

	
	
	
	
	
}
