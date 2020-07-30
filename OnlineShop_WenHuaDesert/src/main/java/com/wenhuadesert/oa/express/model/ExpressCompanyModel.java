package com.wenhuadesert.oa.express.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("ExpressCompany")
public class ExpressCompanyModel implements Serializable {
	
	private String excname = null;
	private int excphone = 0;
	private int excid=0;
	public String getExcname() {
		return excname;
	}
	public void setExcname(String excname) {
		this.excname = excname;
	}
	public int getExcphone() {
		return excphone;
	}
	public void setExcphone(int excphone) {
		this.excphone = excphone;
	}
	public int getExcid() {
		return excid;
	}
	public void setExcid(int excid) {
		this.excid = excid;
	}
	
	
}
