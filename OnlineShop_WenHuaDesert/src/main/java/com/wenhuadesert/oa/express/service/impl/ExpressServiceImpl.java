package com.wenhuadesert.oa.express.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wenhuadesert.oa.express.mapper.IExpressMapper;
import com.wenhuadesert.oa.express.model.ExpressModel;
import com.wenhuadesert.oa.express.service.IExpressService;

@Service("expressServiceSM")
@Transactional // 环绕事务Advice的切入点
public class ExpressServiceImpl implements IExpressService {

	@Autowired
	private IExpressMapper expressMapper = null;

	@Override
	public void add(ExpressModel em) throws Exception {
		expressMapper.insert(em);
	}

	@Override
	public void delete(ExpressModel em) throws Exception {
		expressMapper.delete(em);
	}

	@Override
	public void modify(ExpressModel em) throws Exception {
		expressMapper.update(em);
	}

	@Override
	public List<ExpressModel> getListByAll() throws Exception {
		return expressMapper.selectListByAll();
	}

	@Override
	public List<ExpressModel> getListByAllWithPage(int rows, int page) throws Exception {
<<<<<<< HEAD
		return expressMapper.selectListByAllWithPage(rows * (page - 1), rows);
=======
		return expressMapper.selectListByAllWithCompanyWithOrderWithPage(rows * (page - 1), rows);
>>>>>>> branch 'master' of https://github.com/wenhuadesert/backendlib.git
	}

	@Override
	public ExpressModel getExpressById(int id) throws Exception {
		return expressMapper.selectExpressById(id);
	}

	@Override
	public int getCountByAll() throws Exception {
		return expressMapper.selectCountByAll();
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

}
