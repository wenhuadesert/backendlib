package com.wenhuadesert.oa.client.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wenhuadesert.oa.client.model.ClientModel;
import com.wenhuadesert.oa.goods.model.GoodsModel;

@Mapper
public interface IClientMapper {
	public void insert(ClientModel cm) throws Exception;
	public void delete(ClientModel cm) throws Exception;
	public void update(ClientModel cm) throws Exception;
	public List<ClientModel> selectListByAll() throws Exception;
	public List<ClientModel> selectListByAllWithGoods() throws Exception;
	public List<ClientModel> selectListByAllByCondition(@Param("cliname")String cliname, @Param("clisex")String clisex,@Param("cliusername")String cliusername, @Param("clipassword")String clipassword, @Param("cliaddress")String cliaddress) throws Exception;
	public List<ClientModel> selectListByAllByConditionWithGoods(@Param("cliname")String cliname, @Param("clisex")String clisex,@Param("cliusername")String cliusername, @Param("clipassword")String clipassword, @Param("cliaddress")String cliaddress) throws Exception;
	public List<ClientModel> selectListByAllWithPage(@Param("start")int start, @Param("rows") int rows) throws Exception;
	public List<ClientModel> selectListByAllWithGoodsWithPage(@Param("start")int start, @Param("rows") int rows) throws Exception;
	public List<ClientModel> selectListByAllByConditionWithPage(@Param("cliname")String cliname, @Param("clisex")String clisex,@Param("cliusername")String cliusername, @Param("clipassword")String clipassword, @Param("cliaddress")String cliaddress,@Param("start")int start, @Param("rows") int rows) throws Exception;
	public List<ClientModel> selectListByAllByConditionWithGoodsWithPage(@Param("cliname")String cliname, @Param("clisex")String clisex,@Param("cliusername")String cliusername, @Param("clipassword")String clipassword, @Param("cliaddress")String cliaddress,@Param("start")int start, @Param("rows") int rows) throws Exception;
	public ClientModel selectClientById(int id) throws Exception;
	public int selectCountByAll() throws Exception;
	public int selectCountByAllWithGoods() throws Exception;
	public int selectCountByAllByCondition(@Param("cliname")String cliname, @Param("clisex")String clisex,@Param("cliusername")String cliusername, @Param("clipassword")String clipassword, @Param("cliaddress")String cliaddress) throws Exception;
	public int selectCountByAllByConditionWithGoods(@Param("cliname")String cliname, @Param("clisex")String clisex,@Param("cliusername")String cliusername, @Param("clipassword")String clipassword, @Param("cliaddress")String cliaddress) throws Exception;
	
	public List<GoodsModel> selectGoodsByClientFromCart(int id) throws Exception;
}
