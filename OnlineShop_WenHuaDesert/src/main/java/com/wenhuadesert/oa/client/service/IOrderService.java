package com.wenhuadesert.oa.client.service;

import java.util.List;

import com.wenhuadesert.oa.client.model.OrderModel;

public interface IOrderService {

	public void add(OrderModel om) throws Exception;
	public void delete(OrderModel om) throws Exception;
	public void modify(OrderModel om) throws Exception;
	public List<OrderModel> getListByAll() throws Exception;
	public List<OrderModel> getListByAllWithGoods() throws Exception;
	public List<OrderModel> getListByAllWithPage(int start,  int rows) throws Exception;
	public List<OrderModel> getListByAllWithGoodsWithPage(int start,  int rows) throws Exception;
	public OrderModel getOrderById(int id) throws Exception;
	public int getCountByAll() throws Exception;
}
