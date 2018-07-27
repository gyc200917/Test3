package com.sanyang.pojo;

public class Product {

	private Integer pid;//	number
	private String proName;//	Varchar2(40)
	private Integer price;//	number
	private String descri;//	Varchar2(300)
	private Integer typeId;//	number
	
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
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getDescri() {
		return descri;
	}
	public void setDescri(String descri) {
		this.descri = descri;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", proName=" + proName + ", price=" + price + ", descri=" + descri + ", typeId="
				+ typeId + ", tid=" + tid + ", proTypeName=" + proTypeName + "]";
	}

	
	
	
	
}
