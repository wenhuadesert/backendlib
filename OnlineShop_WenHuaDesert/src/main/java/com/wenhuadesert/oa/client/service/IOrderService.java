package com.wenhuadesert.oa.client.service;

import java.util.List;

import com.wenhuadesert.oa.client.model.OrderModel;

public interface IOrderService {

	public void add(OrderModel om) throws Exception;
	public void delete(OrderModel om) throws Exception;
	public void modify(OrderModel om) throws Exception;
	public List<OrderModel> getListByAll() throws Exception;
	public List<OrderModel> getListByAllWithGoods() throws Exception;
	public List<OrderModel> getListByAllWithClient() throws Exception;
	public List<OrderModel> getListByAllWithClientWithGoods() throws Exception;
	public List<OrderModel> getListByAllWithPage(int start,  int rows) throws Exception;
	public List<OrderModel> getListByAllWithGoodsWithPage(int start,  int rows) throws Exception;
	public List<OrderModel> getListByAllWithClientWithPage(int start,  int rows) throws Exception;
	public List<OrderModel> getListByAllWithClientWithGoodsWithPage(int start,  int rows) throws Exception;
	public OrderModel getOrderById(int id) throws Exception;
	public int getCountByAll() throws Exception;
	public int getCountByAllWithGoods() throws Exception;
	public int getCountByAllWithClient() throws Exception;
	public int getCountByAllWithClientWithGoods() throws Exception;
	public int getPageCountByAll(int rows) throws Exception;
	public int getPageCountByAllWithGoods(int rows) throws Exception;
	public int getPageCountByAllWithClient(int rows) throws Exception;
	public int getPageCountByAllWithClientWithGoods(int rows) throws Exception;
}
