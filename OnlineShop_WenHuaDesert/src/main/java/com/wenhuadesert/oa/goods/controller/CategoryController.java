package com.wenhuadesert.oa.goods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenhuadesert.oa.goods.model.CategoryModel;
import com.wenhuadesert.oa.goods.service.ICategoryService;
import com.wenhuadesert.oa.restresult.Result;

@RestController
@RequestMapping(value = "/category")
@CrossOrigin
public class CategoryController {
	
	@Autowired
	private ICategoryService categoryService=null;
	
	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody CategoryModel categoryModel) throws Exception {
		categoryService.add(categoryModel);
		Result<String> result = new Result<String>();
		result.setStatus("ok");
		result.setMessage("增加商品类别成功");
		return result;
	}
	
	@PostMapping(value = "/modify")
	public Result<String> modify(@RequestBody CategoryModel categoryModel) throws Exception {
		categoryService.modify(categoryModel);
		Result<String> result = new Result<String>();
		result.setStatus("ok");
		result.setMessage("修改商品类别成功");
		return result;
	}
	
	@PostMapping(value="/delete")
	public Result<String> delete(@RequestBody CategoryModel categoryModel) throws Exception{
		categoryService.delete(categoryModel);
		Result<String> result=new Result<String>();
		result.setStatus("ok");
		result.setMessage("删除商品类别成功");
		return result;
	}
	
	@GetMapping(value="/list/all/page")
	public Result<CategoryModel> getListByAllWithPage(@RequestParam(required = false,defaultValue = "10")int rows,@RequestParam(required = false,defaultValue = "1")int page) throws Exception{
		Result<CategoryModel> result=new Result<CategoryModel>();
		result.setCount(categoryService.getCountByAll());
		result.setPageCount(categoryService.getPageCountByAll(rows));
		result.setPage(page);
		result.setRows(rows);
		result.setList(categoryService.getListByAllWithPage(rows, page));
		
		result.setStatus("ok");
		result.setMessage("取得商品列表分页成功");
		return result;
	}
	
	@GetMapping(value="/get")
	public Result<CategoryModel> getByNo(@RequestParam(required = true)int no) throws Exception{
		Result<CategoryModel> result=new Result<CategoryModel>();
		result.setResult(categoryService.getByNo(no));
		
		result.setStatus("ok");
		result.setMessage("取得商品成功");
		return result;
	}
}
