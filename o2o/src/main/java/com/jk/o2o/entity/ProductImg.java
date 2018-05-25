package com.jk.o2o.entity;

import java.util.Date;

public class ProductImg {
/**
 * 商品图片
 * */
	//imgID
	private Long productImgId;
	//图片地址
	private String imgAddr;
	//图片说明
	private String imgDesc;
	//权重
	private Integer priority;
	//创建时间
	private Date creatTime;
	//属于哪个商品
	private Long productId;
	
	
	public Long getProductImgId() {
		return productImgId;
	}
	public void setProductImgId(Long productImgId) {
		this.productImgId = productImgId;
	}
	public String getImgAddr() {
		return imgAddr;
	}
	public void setImgAddr(String imgAddr) {
		this.imgAddr = imgAddr;
	}
	public String getImgDesc() {
		return imgDesc;
	}
	public void setImgDesc(String imgDesc) {
		this.imgDesc = imgDesc;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	
	
}
