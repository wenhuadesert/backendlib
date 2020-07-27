package com.wenhuadesert.oa.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenhuadesert.oa.employee.model.EmployeeModel;
import com.wenhuadesert.oa.employee.service.IEmployeeService;
import com.wenhuadesert.oa.restresult.Result;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService es = null; 

	@RequestMapping(value="/list/all/page")
	public Result<EmployeeModel> getByAllWithPage(@RequestParam(required=false, defaultValue="10") int rows,@RequestParam(required=false, defaultValue="1") int page)throws Exception{
		Result<EmployeeModel> result = new Result<EmployeeModel>();
		result.setPage(page);
		result.setRows(rows);
		result.setList(es.getListByAllWithPage(rows, page));
		result.setStatus("OK");
		result.setMessage("取得部门列表分页方式成功");
		return result;
	}
}
