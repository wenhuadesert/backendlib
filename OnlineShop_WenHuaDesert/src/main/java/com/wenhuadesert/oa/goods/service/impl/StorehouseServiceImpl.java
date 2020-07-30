package com.wenhuadesert.oa.goods.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wenhuadesert.oa.goods.mapper.IStorehouseMapper;
import com.wenhuadesert.oa.goods.model.StorehouseModel;
import com.wenhuadesert.oa.goods.service.IStorehouseService;


@Service("StorehouseService")
@Transactional // 环绕事务Advice的切入点
public class StorehouseServiceImpl implements IStorehouseService {

	@Autowired
	private IStorehouseMapper storehouseMapper = null;

	@Override
	public int add(StorehouseModel storehouseModel) throws Exception {
		storehouseMapper.insert(storehouseModel);
		return storehouseModel.getStorehouseId();
	}

	@Override
	public void modify(StorehouseModel storehouseModel) throws Exception {
		storehouseMapper.update(storehouseModel);

	}

	@Override
	public void delete(StorehouseModel storehouseModel) throws Exception {
		storehouseMapper.delete(storehouseModel);

	}

	@Override
	public List<StorehouseModel> getListByAll() throws Exception {

		return storehouseMapper.selectListByAll();
	}

	@Override
	public List<StorehouseModel> getListByAllWithPage(int rows, int page) throws Exception {

		return storehouseMapper.selectListByAllWithPage(rows * (page - 1), rows);
	}

	@Override
	public int getCountByAll() throws Exception {

		return storehouseMapper.selectCountByAll();
	}

	@Override
	public int getPageCountByAll(int rows) throws Exception {
		int count = this.getCountByAll();
		int pageCount = 0;
		if (count % rows == 0) {
			pageCount = count / rows;
		} else {
			pageCount = count / rows + 1;
		}
		return pageCount;
	}

	@Override
	public StorehouseModel getByNo(int id) throws Exception {

		return storehouseMapper.selectById(id);
	}
	@Override
	public List<StorehouseModel> getByAddress(String address) throws Exception {

		return storehouseMapper.selectByAddress(address);
	}
	@Override
	public List<StorehouseModel> getByCapacity(int capacity) throws Exception {

		return storehouseMapper.selectByCapacity(capacity);
	}
	
	public List<StorehouseModel> getListByConditionWithPage  (
			int rows,int page,String address) throws Exception{
		if(address!=null&&address.trim().length()>0) {
			return storehouseMapper.selectListByConditionWithPage(rows*(page-1), rows,address);
		}
		return storehouseMapper.selectListByAllWithPage(rows * (page - 1), rows);
	}

}
