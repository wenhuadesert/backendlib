package com.wenhuadesert.oa.goods.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;


@Alias("Goods")
public class GoodsModel implements Serializable {
	private int goodsId = 0;//
	private String goodsTag = null;
	private double price = 0;
	private int goodsStock = 0;
	private String brand = null;

	private StorehouseModel storehouse = null;
	private CategoryModel category = null;

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsTag() {
		return goodsTag;
	}

	public void setGoodsTag(String goodsTag) {
		this.goodsTag = goodsTag;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getGoodsStock() {
		return goodsStock;
	}

	public void setGoodsStock(int goodsStock) {
		this.goodsStock = goodsStock;
	}

	public CategoryModel getCategory() {
		return category;
	}

	public void setCategory(CategoryModel category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public StorehouseModel getStorehouse() {
		return storehouse;
	}

	public void setStorehouse(StorehouseModel storehouse) {
		this.storehouse = storehouse;
	}

}
