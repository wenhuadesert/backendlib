package com.wenhuadesert.oa.express.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import com.wenhuadesert.oa.client.model.OrderModel;

@Alias("Express")
public class ExpressModel implements Serializable {
	int expid = 0;
	boolean isArrived=false;
	private ExpressCompanyModel expressCompany = null;
	private OrderModel order = null;
	public int getId() {
		return expid;
	}
	public void setId(int id) {
		this.expid = id;
	}
	public boolean isArrived() {
		return isArrived;
	}
	public void setArrived(boolean arrived) {
		this.isArrived = arrived;
	}
	public ExpressCompanyModel getExpressCompany() {
		return expressCompany;
	}
	public void setExpressCompany(ExpressCompanyModel expressCompany) {
		this.expressCompany = expressCompany;
	}
	
	public OrderModel getOrder() {
		return order;
	}
	public void setOrder(OrderModel order) {
		this.order = order;
	}
	
}
