package com.wenhuadesert.oa.goods.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wenhuadesert.oa.goods.model.CategoryModel;

@Mapper
public interface ICategoryMapper {
	public void insert(CategoryModel categoryModel) throws Exception;

	public void update(CategoryModel categoryModel) throws Exception;

	public void delete(CategoryModel categoryModel) throws Exception;

	public List<CategoryModel> selectListByAll() throws Exception;

	public List<CategoryModel> selectByAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;

	public int selectCountByAll() throws Exception;

	public CategoryModel selectById(int id) throws Exception;



}
