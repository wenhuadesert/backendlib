package com.wenhuadesert.oa.client.model;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;

import com.wenhuadesert.oa.goods.model.GoodsModel;

@Alias("Order")
public class OrderModel implements Serializable {
	private int ordid=0;
	private boolean isPaid = false;

	private ClientModel client=null;
	private List<GoodsModel> goods = null; 
	private int ogcount=0;
	public int getId() {
		return ordid;
	}
	public void setId(int id) {
		this.ordid = id;
	}
	public boolean isPaid() {
		return isPaid;
	}
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
	public ClientModel getClient() {
		return client;
	}
	public void setClient(ClientModel client) {
		this.client = client;
	}
	public List<GoodsModel> getGoods() {
		return goods;
	}
	public void setGoods(List<GoodsModel> goods) {
		this.goods = goods;
	}
	public int getOgcount() {
		return ogcount;
	}
	public void setOgcount(int ogcount) {
		this.ogcount = ogcount;
	}

}
