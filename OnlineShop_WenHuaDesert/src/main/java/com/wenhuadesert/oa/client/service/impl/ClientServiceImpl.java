package com.wenhuadesert.oa.client.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wenhuadesert.oa.client.mapper.IClientMapper;
import com.wenhuadesert.oa.client.model.ClientModel;
import com.wenhuadesert.oa.client.service.IClientService;

@Service("clientServiceSM")
@Transactional //环绕事务Advice的切入点
public class ClientServiceImpl implements IClientService {

	@Autowired 
	private IClientMapper clientMapper = null;
	
	@Override
	public void add(ClientModel cm) throws Exception {
		clientMapper.insert(cm);
	}

	@Override
	public void delete(ClientModel cm) throws Exception {
		clientMapper.delete(cm);
	}

	@Override
	public void modify(ClientModel cm) throws Exception {
		clientMapper.update(cm);
	}

	@Override
	public List<ClientModel> getListByAll() throws Exception {
		return clientMapper.selectListByAll();
	}

	@Override
	public List<ClientModel> getListByAllWithGoods() throws Exception {
		return clientMapper.selectListByAllWithGoods();
	}

	@Override
	public List<ClientModel> getListByAllWithPage(int start, int rows) throws Exception {
		return clientMapper.selectListByAllWithPage(start, rows);
	}

	@Override
	public List<ClientModel> getListByAllWithGoodsWithPage(int start, int rows) throws Exception {
		return clientMapper.selectListByAllWithGoodsWithPage(start, rows);
	}

	@Override
	public ClientModel getClientById(int id) throws Exception {
		return clientMapper.selectClientById(id);
	}

	@Override
	public int getCountByAll() throws Exception {
		return clientMapper.selectCountByAll();
	}

	@Override
	public boolean validate(int id, String password) throws Exception {
		ClientModel cm = clientMapper.selectClientById(id);
		if(cm != null && cm.getPassword()!=null && cm.getPassword().equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}

}
