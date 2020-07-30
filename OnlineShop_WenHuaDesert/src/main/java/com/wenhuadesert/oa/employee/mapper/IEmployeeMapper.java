package com.wenhuadesert.oa.employee.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wenhuadesert.oa.employee.model.EmployeeModel;

@Mapper
public interface IEmployeeMapper {
	public void insert(EmployeeModel em) throws Exception;
	public void insertWithPhoto(EmployeeModel em) throws Exception;
	public void delete(EmployeeModel em) throws Exception;
	public void update(EmployeeModel em) throws Exception;
	public List<EmployeeModel> selectListByAll() throws Exception;
	public List<EmployeeModel> selectListByAllWithPage(@Param("start")int start, @Param("rows") int rows) throws Exception;
	public EmployeeModel selectEmployeeById(int id) throws Exception;
	public int selectCountByAll() throws Exception;
}
