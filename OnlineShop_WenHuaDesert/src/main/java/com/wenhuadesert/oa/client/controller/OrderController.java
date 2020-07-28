package com.wenhuadesert.oa.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenhuadesert.oa.client.model.OrderModel;
import com.wenhuadesert.oa.client.service.IOrderService;
import com.wenhuadesert.oa.restresult.Result;

@RestController
@RequestMapping(value="/order")
@CrossOrigin
public class OrderController {

	@Autowired
	private IOrderService os= null;
	
	@PostMapping(value = "/add")
	public Result<String> add(OrderModel em) throws Exception {
		os.add(em);
		Result<String> result = new Result<String>();
		result.setStatus("ok");
		result.setMessage("增加商品类别成功");
		return result;
	}
	
	@PostMapping(value = "/modify")
	public Result<String> modify(OrderModel em) throws Exception {
		os.modify(em);
		Result<String> result = new Result<String>();
		result.setStatus("ok");
		result.setMessage("修改商品类别成功");
		return result;
	}
	
	@PostMapping(value="/delete")
	public Result<String> delete(OrderModel em) throws Exception{
		os.delete(em);
		Result<String> result=new Result<String>();
		result.setStatus("ok");
		result.setMessage("删除商品类别成功");
		return result;
	}
	
	@GetMapping(value="/list/all/page")
	public Result<OrderModel> getListByAllWithPage(@RequestParam(required = false,defaultValue = "10")int rows,@RequestParam(required = false,defaultValue = "1")int page) throws Exception{
		Result<OrderModel> result=new Result<OrderModel>();
		result.setCount(os.getCountByAll());
		result.setPageCount(os.getPageCountByAll(rows));
		result.setPage(page);
		result.setRows(rows);
		result.setList(os.getListByAllWithPage(rows, page));
		
		result.setStatus("ok");
		result.setMessage("取得商品列表分页成功");
		return result;
	}
	
	@GetMapping(value="/get")
	public Result<OrderModel> getByNo(@RequestParam(required = true)int id) throws Exception{
		Result<OrderModel> result=new Result<OrderModel>();
		result.setResult(os.getOrderById(id));
		
		result.setStatus("ok");
		result.setMessage("取得商品成功");
		return result;
	}
}
