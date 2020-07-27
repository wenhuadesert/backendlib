package com.wenhuadesert.oa.express.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wenhuadesert.oa.express.model.ExpressModel;

public interface IExpressService {
	public void add(ExpressModel em) throws Exception;
	public void delete(ExpressModel em) throws Exception;
	public void modify(ExpressModel em) throws Exception;
	public List<ExpressModel> getListByAll() throws Exception;
	public List<ExpressModel> getListByAllWithPage(@Param("page")int page, @Param("rows") int rows) throws Exception;
	public ExpressModel getExpressById(int id)throws Exception;
	public int getCountByAll() throws Exception;
	public int getPageCountByAll(int rows) throws Exception;

}
