package com.wenhuadesert.oa.express.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wenhuadesert.oa.express.model.ExpressCompanyModel;
import com.wenhuadesert.oa.express.model.ExpressModel;

@Mapper
public interface IExpressMapper {
	public void insert(ExpressModel em) throws Exception;
	public void delete(ExpressModel em) throws Exception;
	public void update(ExpressModel em) throws Exception;
	
	public List<ExpressModel> selectListByAll() throws Exception;
	public List<ExpressModel> selectListByAllByCondition(boolean isArrived) throws Exception;
	public List<ExpressModel> selectListByAllWithCompany() throws Exception;
	public List<ExpressModel> selectListByAllWithOrder() throws Exception;
	public List<ExpressModel> selectListByAllWithCompanyWithOrder() throws Exception;
	public List<ExpressModel> selectListByAllByConditionWithCompany(@Param("isArrived")boolean isArrived, @Param("expressCompany")ExpressCompanyModel expressCompany) throws Exception;
	
	public List<ExpressModel> selectListByAllWithPage(@Param("start")int start, @Param("rows") int rows) throws Exception;
	public List<ExpressModel> selectListByAllByConditionWithPage(@Param("isArrived")boolean isArrived, @Param("start")int start, @Param("rows") int rows) throws Exception;
	public List<ExpressModel> selectListByAllWithCompanyWithPage(@Param("start")int start, @Param("rows") int rows) throws Exception;
	public List<ExpressModel> selectListByAllWithOrderWithPage(@Param("start")int start, @Param("rows") int rows) throws Exception;
	public List<ExpressModel> selectListByAllWithCompanyWithOrderWithPage(@Param("start")int start, @Param("rows") int rows) throws Exception;
	public List<ExpressModel> selectListByAllByConditionWithCompanyWithPage(@Param("isArrived")boolean isArrived, @Param("expressCompany")ExpressCompanyModel expressCompany, @Param("start")int start, @Param("rows") int rows) throws Exception;
	
	public ExpressModel selectExpressById(int id)throws Exception;
	public int selectCountByAll() throws Exception;
	public int selectCountByAllByCondition(boolean isArrived) throws Exception;
	public int selectCountByAllWithCompany() throws Exception;
	public int selectCountByAllWithOrder() throws Exception;
	public int selectCountByAllWithCompanyWithOrder() throws Exception;
	public int selectCountByAllByConditionWithCompany(@Param("isArrived")boolean isArrived, @Param("expressCompany")ExpressCompanyModel expressCompany) throws Exception;
}
