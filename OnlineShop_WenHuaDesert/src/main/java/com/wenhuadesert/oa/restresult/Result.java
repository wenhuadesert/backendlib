package com.wenhuadesert.oa.restresult;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Result<T> {
	private T result=null;
	private List<T> list=null;
	private int intResult=0;
	private String stringResult=null;
	private double doubleResult=0;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateResult=null;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date timeResult=null;
	private String status=null;
	private String message=null;
	private int count = 0;
	private int pageCount=0;
	private int rows=0;
	private int page=0;
	
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public int getIntResult() {
		return intResult;
	}
	public void setIntResult(int intResult) {
		this.intResult = intResult;
	}
	public String getStringResult() {
		return stringResult;
	}
	public void setStringResult(String stringResult) {
		this.stringResult = stringResult;
	}
	public double getDoubleResult() {
		return doubleResult;
	}
	public void setDoubleResult(double doubleResult) {
		this.doubleResult = doubleResult;
	}
	public Date getDateResult() {
		return dateResult;
	}
	public void setDateResult(Date dateResult) {
		this.dateResult = dateResult;
	}
	public Date getTimeResult() {
		return timeResult;
	}
	public void setTimeResult(Date timeResult) {
		this.timeResult = timeResult;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
}
