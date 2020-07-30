package com.wenhuadesert.oa.express.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wenhuadesert.oa.express.mapper.IExpressCompanyMapper;
import com.wenhuadesert.oa.express.model.ExpressCompanyModel;
import com.wenhuadesert.oa.express.service.IExpressCompanyService;

@Service("expressCompanyServiceSM")
@Transactional // 环绕事务Advice的切入点
public class ExpressCompanyServiceImpl implements IExpressCompanyService {

	@Autowired
	IExpressCompanyMapper expressCompanyMapper = null;

	@Override
	public void add(ExpressCompanyModel em) throws Exception {
		expressCompanyMapper.insert(em);
	}

	@Override
	public void delete(ExpressCompanyModel em) throws Exception {
		expressCompanyMapper.delete(em);
		System.out.println("11111111");
	}

	@Override
	public void modify(ExpressCompanyModel em) throws Exception {
		expressCompanyMapper.update(em);
		System.out.println("11111111");
	}

	@Override
	public List<ExpressCompanyModel> getListByAll() throws Exception {
		return expressCompanyMapper.selectListByAll();
	}

	@Override
	public List<ExpressCompanyModel> getListByAllWithPage(int rows, int page) throws Exception {
		return expressCompanyMapper.selectListByAllWithPage(rows * (page - 1), rows);
	}

	@Override
	public ExpressCompanyModel getCompanyById(int id) throws Exception {
		return expressCompanyMapper.selectCompanyById(id);
	}

	@Override
	public int getCountByAll() throws Exception {
		return expressCompanyMapper.selectCountByAll();
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
