package com.wenhuadesert.oa.goods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.wenhuadesert.oa.goods.mapper.IGoodsMapper;
import com.wenhuadesert.oa.goods.model.GoodsModel;
import com.wenhuadesert.oa.goods.service.IGoodsService;

@Service("GoodsService")
@Transactional // 环绕事务Advice的切入点
public class GoodsServiceImpl implements IGoodsService {

	@Autowired
	private IGoodsMapper goodsMapper = null;

	@Override
	public int add(GoodsModel goodsModel) throws Exception {
		goodsMapper.insert(goodsModel);
		return goodsModel.getGoodsId();
	}

	@Override
	public void modify(GoodsModel goodsModel) throws Exception {
		goodsMapper.update(goodsModel);
	}

	@Override
	public void delete(GoodsModel goodsModel) throws Exception {
		goodsMapper.delete(goodsModel);

	}

	@Override
	public List<GoodsModel> getListByAll() throws Exception {
		return goodsMapper.selectListByAll();
	}

	@Override
	public List<GoodsModel> getListByAllWithPage(int rows, int page) throws Exception {
		return goodsMapper.selectListByAllWithPageWithCategoryAndStorehouse(rows * (page - 1), rows);
	}

	@Override
	public int getCountByAll() throws Exception {
		return goodsMapper.selectCountByAll();
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
	public GoodsModel getByNo(int goodsId) throws Exception {
		return goodsMapper.selectById(goodsId);
	}

	@Override
	public GoodsModel getByNoWithCategoryAndStorehouse(int no) throws Exception {

		return goodsMapper.selectByIdWithCategoryAndStorehouse(no);
	}

	@Override
	public List<GoodsModel> getListByConditionWithPageWithCategoryAndStorehouse(int rows, int page, int categoryId,
			double lowPrice, double highPrice, int goodsStock, String brand) throws Exception {
		if(brand!=null&&brand.trim().length()>0) {
			brand="%"+brand+"%";
		}
		return goodsMapper.selectListByConditionWithPageWithCategoryAndStorehouse(rows * (page - 1), rows, categoryId,
				lowPrice, highPrice, goodsStock, brand);
	}

	@Override
	public int getPageCountByCondition(int rows, int categoryId, double lowPrice, double highPrice, int goodsStock,
			String brand) throws Exception {
		if(brand!=null&&brand.trim().length()>0) {
			brand="%"+brand+"%";
		}
		int count = this.getCountByCondition(categoryId, lowPrice, highPrice, goodsStock, brand);
		int pageCount = 0;
		if (count % rows == 0) {
			pageCount = count / rows;
		} else {
			pageCount = count / rows + 1;
		}

		return pageCount;
	}

	@Override
	public void modifyPhoto(MultipartFile goodsPhoto, int no) throws Exception {
		goodsMapper.updatePhoto(goodsPhoto.getBytes(), goodsPhoto.getOriginalFilename(), goodsPhoto.getContentType(),
				no);
	}

	@Override
	public int getCountByCondition(int categoryId, double lowPrice, double highPrice, int goodsStock, String brand)
			throws Exception {
		if(brand!=null&&brand.trim().length()>0) {
			brand="%"+brand+"%";
		}
		return goodsMapper.selectCountByCondition(categoryId, lowPrice, highPrice, goodsStock, brand);
		 
	}

}
