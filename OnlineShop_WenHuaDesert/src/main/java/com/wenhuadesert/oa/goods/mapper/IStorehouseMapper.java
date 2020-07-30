package com.wenhuadesert.oa.goods.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import com.wenhuadesert.oa.goods.model.StorehouseModel;

@Mapper
public interface IStorehouseMapper {
	public void insert(StorehouseModel storehouseModel) throws Exception;

	public void update(StorehouseModel storehouseModel) throws Exception;

	public void delete(StorehouseModel storehouseModel) throws Exception;

	public List<StorehouseModel> selectListByAll() throws Exception;

	public List<StorehouseModel> selectListByAllWithPage(@Param("start") int start, @Param("rows") int rows)
			throws Exception;

	public int selectCountByAll() throws Exception;

	public StorehouseModel selectById(int no) throws Exception;
	public List<StorehouseModel> selectByAddress(String address) throws Exception;
	public List<StorehouseModel> selectByCapacity(int capacity) throws Exception;
	
	public List<StorehouseModel> selectListByConditionWithPage(
			@Param("start") int start,@Param("rows") int rows,@Param("address") String address) throws Exception;
	
	
}
