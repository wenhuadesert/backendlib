package com.wenhuadesert.oa.express.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wenhuadesert.oa.express.model.ExpressCompanyModel;


@Mapper
public interface IExpressCompanyMapper {
	public void insert(ExpressCompanyModel em) throws Exception;
	public void delete(ExpressCompanyModel em) throws Exception;
	public void update(ExpressCompanyModel em) throws Exception;
	public List<ExpressCompanyModel> selectListByAll() throws Exception;
	public List<ExpressCompanyModel> selectListByAllByCondition(@Param("excname")String excname, @Param("excphone")int excphone) throws Exception;
	public List<ExpressCompanyModel> selectListByAllWithPage(@Param("start")int start, @Param("rows") int rows) throws Exception;
	public List<ExpressCompanyModel> selectListByAllByConditionWithPage(@Param("excname")String excname, @Param("excphone")int excphone, @Param("start")int start, @Param("rows") int rows) throws Exception;
	public ExpressCompanyModel selectCompanyById(int id) throws Exception;
	public int selectCountByAll() throws Exception;
}
