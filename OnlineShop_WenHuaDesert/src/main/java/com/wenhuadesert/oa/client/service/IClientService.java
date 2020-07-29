package com.wenhuadesert.oa.client.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wenhuadesert.oa.client.model.ClientModel;
import com.wenhuadesert.oa.goods.model.GoodsModel;

public interface IClientService {
	public void add(ClientModel cm) throws Exception;
	public void delete(ClientModel cm) throws Exception;
	public void modify(ClientModel cm) throws Exception;
	public List<ClientModel> getListByAll() throws Exception;
	public List<ClientModel> getListByAllWithGoods() throws Exception;
	public List<ClientModel> getListByAllByCondition(String name, String sex,String username, String password, String address) throws Exception;
	public List<ClientModel> getListByAllByConditionWithGoods(String name, String sex,String username, String password, String address) throws Exception;
	public List<ClientModel> getListByAllWithPage(int rows, int page) throws Exception;
	public List<ClientModel> getListByAllWithGoodsWithPage( int rows,int page) throws Exception;
	public List<ClientModel> getListByAllByConditionWithPage(String name, String sex,String username, String password, String address,  int rows,int page) throws Exception;
	public List<ClientModel> getListByAllByConditionWithGoodsWithPage(String name, String sex,String username, String password,String address,  int rows,int page) throws Exception;

	public ClientModel getClientById(int id) throws Exception;
	public int getCountByAll() throws Exception;
	public int getCountByAllWithGoods() throws Exception;
	public int getCountByAllByCondition(String name, String sex,String username, String password, String address) throws Exception;
	public int getCountByAllByConditionWithGoods(String name, String sex,String username, String password, String address) throws Exception;

	public int getPageCountByAll(int rows) throws Exception;
	public int getPageCountByAllWithGoods(int rows) throws Exception;
	public int getPageCountByAllByCondition(String name, String sex,String username, String password, String address, int rows) throws Exception;
	public int getPageCountByAllByConditionWithGoods(String name, String sex,String username, String password, String address, int rows) throws Exception;

	public boolean validate(int id, String password) throws Exception;
	public List<ClientModel> getGoodsByClientWithPage(int id,  int rows, int page) throws Exception;
	public void deleteCartByIdAndClient(int id, int goid)throws Exception;
	public void addCartByIdAndClient(int id, int goid, int cacount)throws Exception;
	public void modifyCartByIdAndClient(int id, int goid, int cacount)throws Exception;
	public List<ClientModel> getCartListByIdWithGoodsWithPage(int id,  int rows, int page) throws Exception;
}
