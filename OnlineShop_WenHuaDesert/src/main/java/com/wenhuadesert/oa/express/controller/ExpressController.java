package com.wenhuadesert.oa.express.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenhuadesert.oa.express.model.ExpressModel;
import com.wenhuadesert.oa.express.service.IExpressService;
import com.wenhuadesert.oa.restresult.Result;

@RestController
@RequestMapping(value="/express")
@CrossOrigin(origins = {"*", "null"})
public class ExpressController {

	@Autowired
	private IExpressService es = null;

	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody ExpressModel em) throws Exception {
		es.add(em);
		Result<String> result = new Result<String>();
		result.setStatus("ok");
		result.setMessage("增加快递单成功");
		return result;
	}
	
	@PostMapping(value = "/modify")
	public Result<String> modify(@RequestBody ExpressModel em) throws Exception {
		es.modify(em);
		Result<String> result = new Result<String>();
		result.setStatus("ok");
		result.setMessage("修改快递单成功");
		return result;
	}
	
	@PostMapping(value="/delete")
	public Result<String> delete(@RequestBody ExpressModel em) throws Exception{
		es.delete(em);
		Result<String> result=new Result<String>();
		result.setStatus("ok");
		result.setMessage("删除快递单成功");
		return result;
	}
	
	@GetMapping(value="/list/all/page")
	public Result<ExpressModel> getListByAllWithPage(@RequestParam(required = false,defaultValue = "10")int rows,@RequestParam(required = false,defaultValue = "1")int page) throws Exception{
		Result<ExpressModel> result=new Result<ExpressModel>();
		result.setCount(es.getCountByAll());
		result.setPageCount(es.getPageCountByAll(rows));
		result.setPage(page);
		result.setRows(rows);
		result.setList(es.getListByAllWithPage(rows, page));
		result.setStatus("ok");
		result.setMessage("取得快递单分页成功");
		return result;
	}
	
	@GetMapping(value="/get")
	public Result<ExpressModel> getByNo(@RequestParam(required = true)int id) throws Exception{
		Result<ExpressModel> result=new Result<ExpressModel>();
		result.setResult(es.getExpressById(id));
		
		result.setStatus("ok");
		result.setMessage("取得快递单成功");
		return result;
	}
}
