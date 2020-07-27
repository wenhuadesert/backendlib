package com.wenhuadesert.oa.client.service;

import java.util.List;

import com.wenhuadesert.oa.client.model.ClientModel;

public interface IClientService {
	public void add(ClientModel cm) throws Exception;
	public void delete(ClientModel cm) throws Exception;
	public void modify(ClientModel cm) throws Exception;
	public List<ClientModel> getListByAll() throws Exception;
	public List<ClientModel> getListByAllWithGoods() throws Exception;
	public List<ClientModel> getListByAllWithPage(int start, int rows)  throws Exception;
	public List<ClientModel> getListByAllWithGoodsWithPage(int start, int rows) throws Exception;
	public ClientModel getClientById(int id) throws Exception;
	public int getCountByAll() throws Exception;
	public boolean validate(int id, String password) throws Exception;
}
