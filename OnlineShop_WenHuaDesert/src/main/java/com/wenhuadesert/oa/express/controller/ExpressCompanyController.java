package com.wenhuadesert.oa.express.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenhuadesert.oa.express.model.ExpressCompanyModel;
import com.wenhuadesert.oa.express.service.IExpressCompanyService;
import com.wenhuadesert.oa.goods.model.StorehouseModel;
import com.wenhuadesert.oa.restresult.Result;

@RestController
@RequestMapping(value="/expresscompany")
@CrossOrigin(origins = {"*", "null"})
public class ExpressCompanyController {

	@Autowired
	private IExpressCompanyService ecs = null;

	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody ExpressCompanyModel em) throws Exception {
		
		ecs.add(em);
		Result<String> result = new Result<String>();
		result.setStatus("ok");
		result.setMessage("增加快递公司成功");
		return result;
	}
	
	@PostMapping(value = "/modify")
	public Result<String> modify(@RequestBody ExpressCompanyModel em) throws Exception {
		ecs.modify(em);
		Result<String> result = new Result<String>();
		result.setStatus("ok");
		result.setMessage("修改快递公司成功");
		return result;
	}
	
	@PostMapping(value="/delete")
	public Result<String> delete(@RequestBody ExpressCompanyModel em) throws Exception{
		ecs.delete(em);
		
		
		Result<String> result=new Result<String>();
		result.setStatus("ok");
		result.setMessage("删除成功");
		return result;
	}
	
	@GetMapping(value="/list/all")
	public Result<ExpressCompanyModel> getListByAll() throws Exception{
		Result<ExpressCompanyModel> result=new Result<ExpressCompanyModel>();
		result.setCount(ecs.getCountByAll());
		result.setList(ecs.getListByAll());
		
		result.setStatus("ok");
		result.setMessage("取得快递公司列表成功");
		return result;
	}
	@GetMapping(value = "/list/all/page")
	public Result<ExpressCompanyModel> getListByAllWithPage(@RequestParam(required = false, defaultValue = "10") int rows,
			@RequestParam(required = false, defaultValue = "1") int page) throws Exception {
		Result<ExpressCompanyModel> result = new Result<ExpressCompanyModel>();
		result.setCount(ecs.getCountByAll());
		result.setPageCount(ecs.getPageCountByAll(rows));
		result.setPage(page);
		result.setRows(rows);
		result.setList(ecs.getListByAllWithPage(rows, page));

		result.setStatus("ok");
		result.setMessage("取得快递公司列表分页成功");
		return result;
	}
	@GetMapping(value="/get")
	public Result<ExpressCompanyModel> getByNo(@RequestParam(required = true)int id) throws Exception{
		Result<ExpressCompanyModel> result=new Result<ExpressCompanyModel>();
		result.setResult(ecs.getCompanyById(id));
		
		result.setStatus("ok");
		result.setMessage("取得快递公司成功");
		return result;
	}
}
