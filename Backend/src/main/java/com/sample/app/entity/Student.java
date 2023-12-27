package com.sample.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentTable")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="studentName")
	private String name;
	@Column(name="studentDepartment")
	private String department;
	@Column(name="studentEmail")
	private String email;
	@Column(name="studentPassword")
	private String password;
	public Student() {
		super();
	}
	public Student(long id, String name, String department, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.email = email;
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", department=" + department + ", email=" + email
				+ ", password=" + password + "]";
	}
	

}
