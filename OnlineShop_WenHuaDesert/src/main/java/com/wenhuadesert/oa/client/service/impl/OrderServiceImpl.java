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
	public List<OrderModel> getListByAllWithPage(int page, int rows) throws Exception {

		return orderMapper.selectListByAllWithPage(rows * (page - 1), rows);
	}

	@Override
	public List<OrderModel> getListByAllWithGoodsWithPage(int page, int rows) throws Exception {

		return orderMapper.selectListByAllWithGoodsWithPage(rows * (page - 1), rows);
	}

	@Override
	public OrderModel getOrderById(int id) throws Exception {

		return orderMapper.selectOrderById(id);
	}

	@Override
	public int getCountByAll() throws Exception {

		return orderMapper.selectCountByAll();
	}

	@Override
	public List<OrderModel> getListByAllWithClient() throws Exception {
		return orderMapper.selectListByAllWithClient();
	}

	@Override
	public List<OrderModel> getListByAllWithClientWithGoods() throws Exception {
		return orderMapper.selectListByAllWithClientWithGoods();
	}

	@Override
	public List<OrderModel> getListByAllWithClientWithPage(int page, int rows) throws Exception {
		return orderMapper.selectListByAllWithClientWithGoodsWithPage(rows * (page - 1), rows);
	}

	@Override
	public List<OrderModel> getListByAllWithClientWithGoodsWithPage(int page, int rows) throws Exception {
		return orderMapper.selectListByAllWithClientWithGoodsWithPage(rows * (page - 1), rows);
	}

	@Override
	public int getCountByAllWithGoods() throws Exception {
		return orderMapper.selectCountByAllWithGoods();
	}

	@Override
	public int getCountByAllWithClient() throws Exception {
		return orderMapper.selectCountByAllWithClient();
	}

	@Override
	public int getCountByAllWithClientWithGoods() throws Exception {
		return orderMapper.selectCountByAllWithClientWithGoods();
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
	public int getPageCountByAllWithClient(int rows) throws Exception {
		int count = this.getCountByAllWithClient();
		int pageCount = 0;
		if (count % rows == 0) {
			pageCount = count / rows;
		} else {
			pageCount = count / rows + 1;
		}
		return pageCount;
	}

	@Override
	public int getPageCountByAllWithClientWithGoods(int rows) throws Exception {
		int count = this.getCountByAllWithClientWithGoods();
		int pageCount = 0;
		if (count % rows == 0) {
			pageCount = count / rows;
		} else {
			pageCount = count / rows + 1;
		}
		return pageCount;
	}

}
