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
	private byte[] photo = null; // 商品照片
	private String photoFileName = null; // 照片文件名
	private String photoContentType = null; // 照片类型
	private StorehouseModel storehouse = null;
	private CategoryModel category = null;
	private int cartCount = 0;//购车中的数量
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

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getPhotoFileName() {
		return photoFileName;
	}

	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}

	public String getPhotoContentType() {
		return photoContentType;
	}

	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}

	public int getCartCount() {
		return cartCount;
	}

	public void setCartCount(int cartCount) {
		this.cartCount = cartCount;
	}

}
