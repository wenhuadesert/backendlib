package com.wenhuadesert.oa.express.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wenhuadesert.oa.express.mapper.IExpressMapper;
import com.wenhuadesert.oa.express.model.ExpressModel;
import com.wenhuadesert.oa.express.service.IExpressService;

@Service("expressServiceSM")
@Transactional //环绕事务Advice的切入点
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
	public List<ExpressModel> getListByAllWithPage(int start, int rows) throws Exception {
		return expressMapper.selectListByAllWithPage(start, rows);
	}

	@Override
	public ExpressModel getExpressById(int id) throws Exception {
		return expressMapper.selectExpressById(id);
	}

	@Override
	public int getCountByAll() throws Exception {
		return expressMapper.selectCountByAll();
	}

}
