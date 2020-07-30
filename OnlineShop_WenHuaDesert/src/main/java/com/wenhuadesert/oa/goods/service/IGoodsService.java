package com.wenhuadesert.oa.goods.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.wenhuadesert.oa.goods.model.GoodsModel;

public interface IGoodsService {
	// 增加
	public int add(GoodsModel dm) throws Exception;

	// 修改
	public void modify(GoodsModel dm) throws Exception;

	// 删除
	public void delete(GoodsModel dm) throws Exception;

	// 取得所
	public List<GoodsModel> getListByAll() throws Exception;

	// 取得所有
	public List<GoodsModel> getListByAllWithPage(int rows, int page) throws Exception;

	// 取得个数
	public int getCountByAll() throws Exception;

	// 取得显示页数
	public int getPageCountByAll(int rows) throws Exception;

	// 根据取得指定的对象
	public GoodsModel getByNo(int goodsId) throws Exception;

	public GoodsModel getByNoWithCategoryAndStorehouse(int no) throws Exception;

	public List<GoodsModel> getListByConditionWithPageWithCategoryAndStorehouse(int rows, int page, int categoryId,
			double lowPrice, double highPrice, int goodsStock, String brand) throws Exception;

	public int getCountByCondition(int categoryId, double lowPrice, double highPrice, int goodsStock, String brand)
			throws Exception;

	public int getPageCountByCondition(int rows, int categoryId, double lowPrice, double highPrice, int goodsStock,
			String brand) throws Exception;

	public void modifyPhoto(MultipartFile goodsPhoto, int no) throws Exception;

}
