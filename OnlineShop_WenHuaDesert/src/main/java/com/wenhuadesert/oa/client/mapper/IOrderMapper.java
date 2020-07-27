package com.wenhuadesert.oa.client.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wenhuadesert.oa.client.model.ClientModel;
import com.wenhuadesert.oa.client.model.OrderModel;
import com.wenhuadesert.oa.goods.model.GoodsModel;


@Mapper
public interface IOrderMapper {
	public void insert(OrderModel om) throws Exception;
	public void delete(OrderModel om) throws Exception;
	public void update(OrderModel om) throws Exception;
	public List<OrderModel> selectListByAll() throws Exception;
	public List<OrderModel> selectListByAllWithGoods() throws Exception;
	public List<OrderModel> selectListByAllWithClient() throws Exception;
	public List<OrderModel> selectListByAllWithClientWithGoods() throws Exception;
	public List<OrderModel> selectListByAllWithPage(@Param("start")int start, @Param("rows") int rows) throws Exception;
	public List<OrderModel> selectListByAllWithGoodsWithPage(@Param("start")int start, @Param("rows") int rows) throws Exception;
	public List<OrderModel> selectListByAllWithClientWithPage(@Param("start")int start, @Param("rows") int rows) throws Exception;
	public List<OrderModel> selectListByAllWithClientWithGoodsWithPage(@Param("start")int start, @Param("rows") int rows) throws Exception;
	public OrderModel selectOrderById(int id) throws Exception;
	public int selectCountByAll() throws Exception;
	public int selectCountByAllWithGoods() throws Exception;
	public int selectCountByAllWithClient() throws Exception;
	public int selectCountByAllWithClientWithGoods() throws Exception;
	
	public List<GoodsModel> selectGoodsByOrder(int id) throws Exception;
	public List<ClientModel> selectClientByOrder(int id) throws Exception;
}
