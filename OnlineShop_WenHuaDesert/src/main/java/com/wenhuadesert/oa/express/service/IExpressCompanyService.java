package com.wenhuadesert.oa.express.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wenhuadesert.oa.express.model.ExpressCompanyModel;

public interface IExpressCompanyService {
	public void add(ExpressCompanyModel em) throws Exception;
	public void delete(ExpressCompanyModel em) throws Exception;
	public void modify(ExpressCompanyModel em) throws Exception;
	public List<ExpressCompanyModel> getListByAll() throws Exception;
	public List<ExpressCompanyModel> getListByAllWithPage(@Param("page")int page, @Param("rows") int rows) throws Exception;
	public ExpressCompanyModel getCompanyById(int id) throws Exception;
	public int getCountByAll() throws Exception;

}
