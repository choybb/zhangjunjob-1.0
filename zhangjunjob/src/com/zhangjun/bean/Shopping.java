package com.zhangjun.bean;

import com.zhangjun.bean.Product;
import com.zhangjun.bean.Users;

public class Shopping {

	private Integer ptid;
	private Product pid;
	private Integer pcount;
	private Users uid;
	
	public Integer getPtid() {
		return ptid;
	}
	public void setPtid(Integer ptid) {
		this.ptid = ptid;
	}
	public Product getPid() {
		return pid;
	}
	public void setPid(Product pid) {
		this.pid = pid;
	}
	public Integer getPcount() {
		return pcount;
	}
	public void setPcount(Integer pcount) {
		this.pcount = pcount;
	}
	public Users getUid() {
		return uid;
	}
	public void setUid(Users uid) {
		this.uid = uid;
	}
	
	
}
