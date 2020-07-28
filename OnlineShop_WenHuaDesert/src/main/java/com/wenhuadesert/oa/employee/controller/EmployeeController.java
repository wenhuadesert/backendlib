package com.wenhuadesert.oa.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenhuadesert.oa.employee.model.EmployeeModel;
import com.wenhuadesert.oa.employee.service.IEmployeeService;
import com.wenhuadesert.oa.restresult.Result;

@RestController
@RequestMapping(value="/employee")
@CrossOrigin
public class EmployeeController {

	@Autowired
	private IEmployeeService es = null; 
	
	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody EmployeeModel em) throws Exception {
		es.add(em);
		Result<String> result = new Result<String>();
		result.setStatus("ok");
		result.setMessage("增加商品类别成功");
		return result;
	}
	
	@PostMapping(value = "/modify")
	public Result<String> modify(@RequestBody EmployeeModel em) throws Exception {
		es.modify(em);
		Result<String> result = new Result<String>();
		result.setStatus("ok");
		result.setMessage("修改商品类别成功");
		return result;
	}
	
	@PostMapping(value="/delete")
	public Result<String> delete(@RequestBody EmployeeModel em) throws Exception{
		es.delete(em);
		Result<String> result=new Result<String>();
		result.setStatus("ok");
		result.setMessage("删除商品类别成功");
		return result;
	}
	
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
	
	@GetMapping(value="/get")
	public Result<EmployeeModel> getByNo(@RequestParam(required = true)int id) throws Exception{
		Result<EmployeeModel> result=new Result<EmployeeModel>();
		result.setResult(es.getEmployeeById(id));
		
		result.setStatus("ok");
		result.setMessage("取得商品成功");
		return result;
	}

}
