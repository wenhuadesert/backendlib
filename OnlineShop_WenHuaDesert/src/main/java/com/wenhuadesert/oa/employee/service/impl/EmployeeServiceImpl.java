package com.wenhuadesert.oa.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wenhuadesert.oa.employee.mapper.IEmployeeMapper;
import com.wenhuadesert.oa.employee.model.EmployeeModel;
import com.wenhuadesert.oa.employee.service.IEmployeeService;

@Service("employeeServiceSM")
@Transactional //环绕事务Advice的切入点
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private IEmployeeMapper employeeMapper=null;
	
	@Override
	public void add(EmployeeModel em) throws Exception {
		employeeMapper.insert(em);		
	}

	@Override
	public void delete(EmployeeModel em) throws Exception {
		employeeMapper.delete(em);		
	}

	@Override
	public void modify(EmployeeModel em) throws Exception {
		employeeMapper.update(em);		
	}

	@Override
	public List<EmployeeModel> getListByAll() throws Exception {
		return employeeMapper.selectListByAll();		
	}

	@Override
	public List<EmployeeModel> getListByAllWithPage(int rows, int page) throws Exception {
		return employeeMapper.selectListByAllWithPage(rows*(page-1), rows);
	}

	@Override
	public EmployeeModel getEmployeeById(int id) throws Exception {
		return employeeMapper.selectEmployeeById(id);
	}
	
	@Override
	public int getCountByAll() throws Exception {
		return employeeMapper.selectCountByAll();		
	}
	
	@Override
	public boolean validate(int id, String password) throws Exception {
		EmployeeModel em = employeeMapper.selectEmployeeById(id);
		if(em != null && em.getPassword()!=null && em.getPassword().equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}


}
