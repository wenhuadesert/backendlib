package com.wenhuadesert.oa.goods.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.wenhuadesert.oa.goods.model.StorehouseModel;
import com.wenhuadesert.oa.goods.service.IStorehouseService;
import com.wenhuadesert.oa.restresult.Result;

@RestController
@RequestMapping(value = "/storehouse")
@CrossOrigin(origins = {"*", "null"})
public class StorehouseController {

	@Autowired
	private IStorehouseService storehouseService = null;

	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody StorehouseModel storehouseModel) throws Exception {
		storehouseService.add(storehouseModel);
		Result<String> result = new Result<String>();
		result.setStatus("ok");
		result.setMessage("增加仓库成功");
		return result;
	}

	@PostMapping(value = "/modify")
	public Result<String> modify(@RequestBody StorehouseModel storehouseModel) throws Exception {
		storehouseService.modify(storehouseModel);
		Result<String> result = new Result<String>();
		result.setStatus("ok");
		result.setMessage("修改仓库成功");
		return result;
	}

	@PostMapping(value = "/delete")
	public Result<String> delete(@RequestBody StorehouseModel storehouseModel) throws Exception {
		storehouseService.delete(storehouseModel);
		Result<String> result = new Result<String>();
		result.setStatus("ok");
		result.setMessage("删除仓库成功");
		return result;
	}

	@GetMapping(value = "/list/all/page")
	public Result<StorehouseModel> getListByAllWithPage(@RequestParam(required = false, defaultValue = "10") int rows,
			@RequestParam(required = false, defaultValue = "1") int page) throws Exception {
		Result<StorehouseModel> result = new Result<StorehouseModel>();
		result.setCount(storehouseService.getCountByAll());
		result.setPageCount(storehouseService.getPageCountByAll(rows));
		result.setPage(page);
		result.setRows(rows);
		result.setList(storehouseService.getListByAllWithPage(rows, page));

		result.setStatus("ok");
		result.setMessage("取得仓库列表分页成功");
		return result;
	}

	@GetMapping(value = "/get")
	public Result<StorehouseModel> getByNo(@RequestParam(required = true) int no) throws Exception {
		Result<StorehouseModel> result = new Result<StorehouseModel>();
		result.setResult(storehouseService.getByNo(no));

		result.setStatus("ok");
		result.setMessage("取得仓库成功");
		return result;
	}
	
	@GetMapping(value = "/get/condition")
	public Result<StorehouseModel> getByAddress(@RequestParam(required = true) String address) throws Exception {
		Result<StorehouseModel> result = new Result<StorehouseModel>();
		result.setList(storehouseService.getByAddress(address));
		result.setStatus("ok");
		result.setMessage("取得仓库成功");
		return result;
	}
	
	@GetMapping(value = "/get/conditionWithCapacity")
	public Result<StorehouseModel> getByCapacity(@RequestParam(required = true) int capacity) throws Exception {
		Result<StorehouseModel> result = new Result<StorehouseModel>();
		result.setList(storehouseService.getByCapacity(capacity));
		result.setStatus("ok");
		result.setMessage("取得仓库成功");
		return result;
	}
	
	@GetMapping(value="/list/condition/page")
	public Result<StorehouseModel> getListByConditionWithPage(
			@RequestParam(required=false,defaultValue="10") int rows, 
			@RequestParam(required=false,defaultValue="1") int page, 
			@RequestParam(required=false,defaultValue="") String address) throws Exception{
		Result<StorehouseModel> result=new Result<StorehouseModel>();
		result.setPage(page);
		result.setRows(rows);
		System.out.println(address);
		//result.setCount(storehouseService.getCountByCondition(departmentNo,lowAge, highAge, startJoinDate, endJoinDate, sex, nameKey));
		//result.setPageCount(storehouseService.getPageCountByCondition(rows,departmentNo, lowAge, highAge, startJoinDate, endJoinDate, sex, nameKey));
		result.setList(storehouseService.getListByConditionWithPage(rows, page,address));
		result.setStatus("OK");
		result.setMessage("按条件检索仓库列表成功!");
		return result;
	}
	
}
