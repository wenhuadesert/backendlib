package com.wenhuadesert.oa.employee.service;

import java.util.List;

import com.wenhuadesert.oa.employee.model.EmployeeModel;

public interface IEmployeeService {
	public void add(EmployeeModel em) throws Exception;
	public void delete(EmployeeModel em) throws Exception;
	public void modify(EmployeeModel em) throws Exception;
	public List<EmployeeModel> getListByAll() throws Exception;
	public List<EmployeeModel> getListByAllWithPage(int rows, int page) throws Exception;
	public EmployeeModel getEmployeeById(int id) throws Exception;
	public int getCountByAll() throws Exception;	
	public boolean validate(int id, String password) throws Exception;
	

}
