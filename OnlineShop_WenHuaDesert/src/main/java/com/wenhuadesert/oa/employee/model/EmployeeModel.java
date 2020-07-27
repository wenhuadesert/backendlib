package com.wenhuadesert.oa.employee.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("Employee")
public class EmployeeModel implements Serializable {
	private int empid = 0;
	private String empname = null;
	private String empsex = null;
	private String empusername = null;
	private String emppassword = null;
	public int getId() {
		return empid;
	}
	public void setId(int id) {
		this.empid = id;
	}
	public String getName() {
		return empname;
	}
	public void setName(String name) {
		this.empname = name;
	}
	public String getSex() {
		return empsex;
	}
	public void setSex(String sex) {
		this.empsex = sex;
	}
	public String getUsername() {
		return empusername;
	}
	public void setUsername(String username) {
		this.empusername = username;
	}
	public String getPassword() {
		return emppassword;
	}
	public void setPassword(String password) {
		this.emppassword = password;
	}
	
}
