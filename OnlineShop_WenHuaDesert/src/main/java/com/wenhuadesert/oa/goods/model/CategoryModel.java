package com.wenhuadesert.oa.goods.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("Category")
public class CategoryModel implements Serializable {
	private int categoryId=0;//商品类别编号
	private String categoryTag=null;//商品类别名称
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryTag() {
		return categoryTag;
	}
	public void setCategoryTag(String categoryTag) {
		this.categoryTag = categoryTag;
	}
	
}
