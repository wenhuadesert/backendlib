package com.wenhuadesert.oa.goods.service;

import java.util.List;

import com.wenhuadesert.oa.goods.model.CategoryModel;

public interface ICategoryService {
	// 增加
	public int add(CategoryModel categoryModel) throws Exception;

	// 修改
	public void modify(CategoryModel categoryModel) throws Exception;

	// 删除
	public void delete(CategoryModel categoryModel) throws Exception;

	// 取得所
	public List<CategoryModel> getListByAll() throws Exception;

	// 取得所有
	public List<CategoryModel> getListByAllWithPage(int rows, int page) throws Exception;

	// 取得个数
	public int getCountByAll() throws Exception;

	// 取得显示页数
	public int getPageCountByAll(int rows) throws Exception;

	// 根据取得指定的对象
	public CategoryModel getByNo(int id) throws Exception;
}
