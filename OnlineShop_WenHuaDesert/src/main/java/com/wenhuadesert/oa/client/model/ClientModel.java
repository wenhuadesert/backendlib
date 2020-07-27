package com.wenhuadesert.oa.client.model;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;

import com.wenhuadesert.oa.goods.model.GoodsModel;

@Alias("Client")
public class ClientModel implements Serializable {
	private int cliid = 0;
	private String cliname = null;
	private String clisex = null;
	private String cliusername = null;
	private String clipassword = null;
	private String cliaddress = null;
	private List<GoodsModel> goods = null;
	private int cacount=0;
	public int getId() {
		return cliid;
	}
	public void setId(int id) {
		this.cliid = id;
	}
	public String getName() {
		return cliname;
	}
	public void setName(String name) {
		this.cliname = name;
	}
	public String getSex() {
		return clisex;
	}
	public void setSex(String sex) {
		this.clisex = sex;
	}
	public String getUsername() {
		return cliusername;
	}
	public void setUsername(String username) {
		this.cliusername = username;
	}
	public String getPassword() {
		return clipassword;
	}
	public void setPassword(String password) {
		this.clipassword = password;
	}
	public String getAddress() {
		return cliaddress;
	}
	public void setAddress(String address) {
		this.cliaddress = address;
	}	
	public List<GoodsModel> getGoods() {
		return goods;
	}
	public void setGoods(List<GoodsModel> goods) {
		this.goods = goods;
	}
	public int getCacount() {
		return cacount;
	}
	public void setCacount(int cacount) {
		this.cacount = cacount;
	}
}
