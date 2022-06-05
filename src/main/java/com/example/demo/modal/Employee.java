package com.example.demo.modal;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	private int emp_id;
	private String emp_email;
	private String emp_name;
	private String dob;
	private String designation;
	private String address;
	private String phno;
	private String password;
	public Employee() {
		super();
	}
	public Employee(int emp_id, String emp_email, String emp_name, String dob, String designation, String address,
			String phno, String password) {
		super();
		this.emp_id = emp_id;
		this.emp_email = emp_email;
		this.emp_name = emp_name;
		this.dob = dob;
		this.designation = designation;
		this.address = address;
		this.phno = phno;
		this.password = password;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_email() {
		return emp_email;
	}
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_email=" + emp_email + ", emp_name=" + emp_name + ", dob=" + dob
				+ ", designation=" + designation + ", address=" + address + ", phno=" + phno + ", password=" + password
				+ "]";
	}
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy="emp")
	
	private Login l;


	
	
	
	
	
	
}
