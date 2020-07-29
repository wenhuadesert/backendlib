package com.wenhuadesert.oa.goods.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

import com.wenhuadesert.oa.goods.model.GoodsModel;

//商品mapper接口
@Mapper
public interface IGoodsMapper {

	public void insert(GoodsModel goodsModel) throws Exception;

	public void update(GoodsModel goodsModel) throws Exception;

	public void delete(GoodsModel goodsModel) throws Exception;

	public List<GoodsModel> selectListByAll() throws Exception;

	public List<GoodsModel> selectByAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;

	public int selectCountByAll() throws Exception;

	public GoodsModel selectById(int goodsId) throws Exception;

	public GoodsModel selectByIdWithCategory(int id) throws Exception;

	public GoodsModel selectByIdWithCategoryAndStorehouse(int id) throws Exception;

	public List<GoodsModel> selectListByAllWithCategoryAndStorehouse() throws Exception;

	public List<GoodsModel> selectListByAllWithPageWithCategoryAndStorehouse(@Param("start") int start,
			@Param("rows") int rows) throws Exception;

	public List<GoodsModel> selectListByConditionWithPageWithCategoryAndStorehouse(@Param("start") int start,
			@Param("rows") int rows, @Param("lowPrice") double lowPrice, @Param("highPrice") double highPrice,
			@Param("storehouseLocation") String storehouseLocation, @Param("goodsStock") int goodsStock,
			@Param("brand") String brand) throws Exception;

	public int selectCountByCondition(@Param("lowPrice") double lowPrice, @Param("highPrice") double highPrice,
			@Param("storehouseLocation") String storehouseLocation, @Param("goodsStock") int goodsStock,
			@Param("brand") String brand) throws Exception;

	public void updatePhoto(@Param("bytes") byte[] bytes, @Param("fileName") String fileName,
			@Param("contentType") String contentType, @Param("no") int no) throws Exception;
}
