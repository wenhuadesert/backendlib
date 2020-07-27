package com.wenhuadesert.oa.goods.service;

import java.util.List;

import com.wenhuadesert.oa.goods.model.StorehouseModel;

public interface IStorehouseService {
	// 增加
	public int add(StorehouseModel storehouseModel) throws Exception;

	// 修改
	public void modify(StorehouseModel storehouseModel) throws Exception;

	// 删除
	public void delete(StorehouseModel storehouseModel) throws Exception;

	// 取得所
	public List<StorehouseModel> getListByAll() throws Exception;

	// 取得所有
	public List<StorehouseModel> getListByAllWithPage(int rows, int page) throws Exception;

	// 取得个数
	public int getCountByAll() throws Exception;

	// 取得显示页数
	public int getPageCountByAll(int rows) throws Exception;

	// 根据取得指定的对象
	public StorehouseModel getByNo(int id) throws Exception;
}
