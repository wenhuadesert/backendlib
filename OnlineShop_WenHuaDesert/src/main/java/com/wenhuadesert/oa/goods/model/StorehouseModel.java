package com.wenhuadesert.oa.goods.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("Storehouse")
public class StorehouseModel implements Serializable {
	private int storehouseId = 0;
	private String address = null;
	private int capacity = 0;

	public int getStorehouseId() {
		return storehouseId;
	}

	public void setStorehouseId(int storehouseId) {
		this.storehouseId = storehouseId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
