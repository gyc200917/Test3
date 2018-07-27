package com.sanyang.pojo;

public class ProductType {

	private Integer tid;//	number
	private String	proTypeName;//	Varchar2(40)
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getProTypeName() {
		return proTypeName;
	}
	public void setProTypeName(String proTypeName) {
		this.proTypeName = proTypeName;
	}
	@Override
	public String toString() {
		return "ProductType [tid=" + tid + ", proTypeName=" + proTypeName + "]";
	}
	
	
	
}
