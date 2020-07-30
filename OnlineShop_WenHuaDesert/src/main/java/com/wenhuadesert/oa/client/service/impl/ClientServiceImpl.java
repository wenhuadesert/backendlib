package com.wenhuadesert.oa.client.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wenhuadesert.oa.client.mapper.IClientMapper;
import com.wenhuadesert.oa.client.model.ClientModel;
import com.wenhuadesert.oa.client.service.IClientService;
import com.wenhuadesert.oa.goods.model.GoodsModel;

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
	public List<ClientModel> getListByAllWithPage(int rows, int page) throws Exception {
		return clientMapper.selectListByAllWithPage(rows * (page - 1), rows);
	}

	@Override
	public List<ClientModel> getListByAllWithGoodsWithPage(int rows, int page) throws Exception {
		return clientMapper.selectListByAllWithGoodsWithPage(rows * (page - 1), rows);
	}

	@Override
	public ClientModel getClientById(int id) throws Exception {
		return clientMapper.selectClientById(id);
	}

	@Override
	public List<ClientModel> getGoodsByClientWithPage(int id, int rows, int page) throws Exception {
		return clientMapper.selectGoodsByClientFromCartWithPage(id, rows * (page - 1), rows);
	}
	
	@Override
	public int getCountByAll() throws Exception {
		return clientMapper.selectCountByAll();
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
	public boolean validate(int id, String password) throws Exception {
		ClientModel cm = clientMapper.selectClientById(id);
		if(cm != null && cm.getPassword()!=null && cm.getPassword().equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public List<ClientModel> getListByAllByCondition(String name, String sex, String username, String password,
			String address) throws Exception {
		return clientMapper.selectListByAllByCondition(name, sex, username, password, address);
	}

	@Override
	public List<ClientModel> getListByAllByConditionWithGoods(String name, String sex, String username, String password,
			String address) throws Exception {
		return clientMapper.selectListByAllByConditionWithGoods(name, sex, username, password, address);
	}

	@Override
	public List<ClientModel> getListByAllByConditionWithPage(String name, String sex, String username, String password,
			String address, int rows, int page) throws Exception {
		if(name!=null&&name.trim().length()>0) {
			name="%"+name+"%";
		}
		if(username!=null&&username.trim().length()>0) {
			username="%"+username+"%";
		}
		if(address!=null&&address.trim().length()>0) {
			address="%"+address+"%";
		}
		return clientMapper.selectListByAllByConditionWithGoodsWithPage(name, sex, username, password, address, rows * (page - 1), rows);
	}

	@Override
	public List<ClientModel> getListByAllByConditionWithGoodsWithPage(String name, String sex, String username,
			String password, String address, int rows, int page) throws Exception {
		return clientMapper.selectListByAllByConditionWithPage(name, sex, username, password, address, rows * (page - 1), rows);
	}

	@Override
	public int getCountByAllWithGoods() throws Exception {
		return clientMapper.selectCountByAllWithGoods();
	}

	@Override
	public int getCountByAllByCondition(String name, String sex, String username, String password, String address)
			throws Exception {
		return clientMapper.selectCountByAllByCondition(name, sex, username, password, address);
	}

	@Override
	public int getCountByAllByConditionWithGoods(String name, String sex, String username, String password,
			String address) throws Exception {
		return clientMapper.selectCountByAllByConditionWithGoods(name, sex, username, password, address);
	}

	@Override
	public int getPageCountByAllWithGoods(int rows) throws Exception {
		int count = this.getCountByAllWithGoods();
		int pageCount = 0;
		if (count % rows == 0) {
			pageCount = count / rows;
		} else {
			pageCount = count / rows + 1;
		}
		return pageCount;
	}

	@Override
	public int getPageCountByAllByCondition(String name, String sex, String username, String password, String address,
			int rows) throws Exception {
		int count = this.getCountByAllByCondition(name, sex, username, password, address);
		int pageCount = 0;
		if (count % rows == 0) {
			pageCount = count / rows;
		} else {
			pageCount = count / rows + 1;
		}
		return pageCount;
	}

	@Override
	public int getPageCountByAllByConditionWithGoods(String name, String sex, String username, String password,
			String address, int rows) throws Exception {
		int count = this.getCountByAllByConditionWithGoods(name, sex, username, password, address);
		int pageCount = 0;
		if (count % rows == 0) {
			pageCount = count / rows;
		} else {
			pageCount = count / rows + 1;
		}
		return pageCount;
	}

	@Override
	public void deleteCartByIdAndClient(int id, int goid) throws Exception {
		clientMapper.deleteCartByIdAndClient(id, goid);
	}

	@Override
	public void addCartByIdAndClient(int id, int goid, int cacount) throws Exception {
		clientMapper.insertCartByIdAndClient(id, goid, cacount);
	}

	@Override
	public void modifyCartByIdAndClient(int id, int goid, int cacount) throws Exception {
		clientMapper.updateCartByIdAndClient(id, goid, cacount);
	}

	@Override
	public List<ClientModel> getCartListByIdWithGoodsWithPage(int id, int rows, int page) throws Exception {
		return clientMapper.selectCartListByIdWithGoodsWithPage(id, rows * (page - 1), rows);
	}
	
	

}
