package com.wenhuadesert.oa.goods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wenhuadesert.oa.goods.mapper.ICategoryMapper;
import com.wenhuadesert.oa.goods.model.CategoryModel;
import com.wenhuadesert.oa.goods.service.ICategoryService;

@Service("CategoryService")
@Transactional // 环绕事务Advice的切入点
public class CategoryServiceImpl implements ICategoryService {

	@Autowired
	private ICategoryMapper categoryMapper = null;

	@Override
	public int add(CategoryModel categoryModel) throws Exception {
		categoryMapper.insert(categoryModel);
		return categoryModel.getCategoryId();
	}

	@Override
	public void modify(CategoryModel categoryModel) throws Exception {
		categoryMapper.update(categoryModel);

	}

	@Override
	public void delete(CategoryModel categoryModel) throws Exception {
		categoryMapper.delete(categoryModel);

	}

	@Override
	public List<CategoryModel> getListByAll() throws Exception {

		return categoryMapper.selectListByAll();
	}

	@Override
	public List<CategoryModel> getListByAllWithPage(int rows, int page) throws Exception {

		return categoryMapper.selectByAllWithPage(rows * (page - 1), rows);
	}

	@Override
	public int getCountByAll() throws Exception {

		return categoryMapper.selectCountByAll();
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
	public CategoryModel getByNo(int id) throws Exception {

		return categoryMapper.selectById(id);
	}

}
