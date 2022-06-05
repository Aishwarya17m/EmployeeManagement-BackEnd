package com.example.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

	@Id
	private int admin_id;
	private String admin_name;
	private String role;
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Admin(int admin_id, String admin_name, String role) {
		super();
		this.admin_id = admin_id;
		this.admin_name = admin_name;
		this.role = role;
	}
	public Admin() {
		super();
	}
	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", admin_name=" + admin_name + ", role=" + role + "]";
	}
	
	
}
