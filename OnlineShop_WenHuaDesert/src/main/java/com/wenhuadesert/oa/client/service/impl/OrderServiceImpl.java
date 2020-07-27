package com.wenhuadesert.oa.client.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wenhuadesert.oa.client.mapper.IOrderMapper;
import com.wenhuadesert.oa.client.model.OrderModel;
import com.wenhuadesert.oa.client.service.IOrderService;

@Service("orderServiceSM")
@Transactional //环绕事务Advice的切入点
public class OrderServiceImpl implements IOrderService {

	@Autowired 
	private IOrderMapper orderMapper=null;
	
	@Override
	public void add(OrderModel om) throws Exception {
		orderMapper.insert(om);
	}

	@Override
	public void delete(OrderModel om) throws Exception {
		orderMapper.delete(om);
	}

	@Override
	public void modify(OrderModel om) throws Exception {
		orderMapper.update(om);
	}

	@Override
	public List<OrderModel> getListByAll() throws Exception {
		return 	orderMapper.selectListByAll();
	}

	@Override
	public List<OrderModel> getListByAllWithGoods() throws Exception {
		return orderMapper.selectListByAllWithGoods();
	}

	@Override
	public List<OrderModel> getListByAllWithPage(int start, int rows) throws Exception {

		return orderMapper.selectListByAllWithPage(start, rows);
	}

	@Override
	public List<OrderModel> getListByAllWithGoodsWithPage(int start, int rows) throws Exception {

		return orderMapper.selectListByAllWithGoodsWithPage(start, rows);
	}

	@Override
	public OrderModel getOrderById(int id) throws Exception {

		return orderMapper.selectOrderById(id);
	}

	@Override
	public int getCountByAll() throws Exception {

		return orderMapper.selectCountByAll();
	}

}
