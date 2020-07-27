package com.wenhuadesert.oa.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenhuadesert.oa.client.model.ClientModel;
import com.wenhuadesert.oa.client.service.IClientService;
import com.wenhuadesert.oa.restresult.Result;

@RestController
@RequestMapping(value="/client")
public class ClientController {

	@Autowired
	private IClientService cs = null;
	
	@PostMapping(value = "/add")
	public Result<String> add(ClientModel em) throws Exception {
		cs.add(em);
		Result<String> result = new Result<String>();
		result.setStatus("ok");
		result.setMessage("增加商品类别成功");
		return result;
	}
	
	@PostMapping(value = "/modify")
	public Result<String> modify(ClientModel em) throws Exception {
		cs.modify(em);
		Result<String> result = new Result<String>();
		result.setStatus("ok");
		result.setMessage("修改商品类别成功");
		return result;
	}
	
	@PostMapping(value="/delete")
	public Result<String> delete(ClientModel em) throws Exception{
		cs.delete(em);
		Result<String> result=new Result<String>();
		result.setStatus("ok");
		result.setMessage("删除商品类别成功");
		return result;
	}
	
	@GetMapping(value="/list/all/page")
	public Result<ClientModel> getListByAllWithPage(@RequestParam(required = false,defaultValue = "10")int rows,@RequestParam(required = false,defaultValue = "1")int page) throws Exception{
		Result<ClientModel> result=new Result<ClientModel>();
		result.setCount(cs.getCountByAll());
		result.setPageCount(cs.getPageCountByAll(rows));
		result.setPage(page);
		result.setRows(rows);
		result.setList(cs.getListByAllWithPage(rows, page));
		
		result.setStatus("ok");
		result.setMessage("取得商品列表分页成功");
		return result;
	}
	
	@GetMapping(value="/get")
	public Result<ClientModel> getByNo(@RequestParam(required = true)int id) throws Exception{
		Result<ClientModel> result=new Result<ClientModel>();
		result.setResult(cs.getClientById(id));
		
		result.setStatus("ok");
		result.setMessage("取得商品成功");
		return result;
	}
}
