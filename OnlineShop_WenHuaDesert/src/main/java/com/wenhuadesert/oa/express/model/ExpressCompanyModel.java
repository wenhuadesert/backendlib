package com.wenhuadesert.oa.express.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("ExpressCompany")
public class ExpressCompanyModel implements Serializable {
	private int excid=0;
	private int excphone = 0;
	private String excname = null;
	public int getId() {
		return excid;
	}
	public void setId(int id) {
		this.excid = id;
	}
	public int getTelephone() {
		return excphone;
	}
	public void setTelephone(int telephone) {
		this.excphone = telephone;
	}
	public String getName() {
		return excname;
	}
	public void setName(String name) {
		this.excname = name;
	}
	
}
