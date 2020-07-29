package com.wenhuadesert.oa.goods.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.wenhuadesert.oa.restresult.Result;
import com.wenhuadesert.oa.goods.model.GoodsModel;
import com.wenhuadesert.oa.goods.service.IGoodsService;

@RestController
@RequestMapping(value = "/goods")
@CrossOrigin
public class GoodsController {
	
	@Autowired
	private IGoodsService goodsService=null;
	
	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody GoodsModel goodsModel) throws Exception {
		Result<String> result = new Result<String>();
		result.setIntResult(goodsService.add(goodsModel));
		result.setStatus("ok");
		result.setMessage("增加商品成功");
		return result;
	}
	
	@PostMapping(value="/updatephoto")
	public Result<String> updatePhoto(@RequestParam(required=false) MultipartFile goodsPhoto,@RequestParam(required=true) int no) throws Exception{
		if(goodsPhoto!=null&&(!goodsPhoto.isEmpty())) {
			goodsService.modifyPhoto(goodsPhoto,no);
			File dist=new File("d:/webroot/photo/"+goodsPhoto.getOriginalFilename());
			goodsPhoto.transferTo(dist);

		}
		Result<String> result=new Result<String>();
		result.setStatus("ok");
		result.setMessage("修改员工照片成功!");
		return result;
	}
	
	@PostMapping(value="/modify")
	public Result<String> modify(@RequestBody GoodsModel goodsModel) throws Exception{
		goodsService.modify(goodsModel);
		Result<String> result=new Result<String>();
		result.setStatus("ok");
		result.setMessage("修改商品成功");
		return result;
	}
	
	@PostMapping(value="/delete")
	public Result<String> delete(@RequestBody GoodsModel goodsModel) throws Exception{
		goodsService.delete(goodsModel);
		Result<String> result=new Result<String>();
		result.setStatus("ok");
		result.setMessage("删除商品成功");
		return result;
	}
	
	@GetMapping(value="/list/all/page")
	public Result<GoodsModel> getListByAllWithPage(@RequestParam(required = false,defaultValue = "10")int rows,@RequestParam(required = false,defaultValue = "1")int page) throws Exception{
		Result<GoodsModel> result=new Result<GoodsModel>();
		result.setCount(goodsService.getCountByAll());
		result.setPageCount(goodsService.getPageCountByAll(rows));
		result.setPage(page);
		result.setRows(rows);
		result.setList(goodsService.getListByAllWithPage(rows, page));
		
		result.setStatus("ok");
		result.setMessage("取得商品列表分页成功");
		return result;
	}
	
	@GetMapping(value="/get")
	public Result<GoodsModel> getByNo(@RequestParam(required = true)int no) throws Exception{
		Result<GoodsModel> result=new Result<GoodsModel>();
		result.setResult(goodsService.getByNoWithCategoryAndStorehouse(no));
		
		result.setStatus("ok");
		result.setMessage("取得商品成功");
		return result;
	}
	
}
