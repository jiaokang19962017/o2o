package com.jk.o2o.entity;

import java.util.Date;

import javax.xml.crypto.Data;

public class HeadLine {
/**
 * 头条实体类
 * */
	//头条id
	private Long LineId;
	//头条名称
	private String lineName;
	//头条链接
	private String lineLink;
	//头条图片
	private String lineImg;
	//权重
	private Integer priority;
	//0.不可用 1.可用
	private Integer enableStatus;
	//创建时间
	private Date creatTime;
	//最后修改时间
	private Data lastEditTime;
	
	
	public Long getLineId() {
		return LineId;
	}
	public void setLineId(Long lineId) {
		LineId = lineId;
	}
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	public String getLineLink() {
		return lineLink;
	}
	public void setLineLink(String lineLink) {
		this.lineLink = lineLink;
	}
	public String getLineImg() {
		return lineImg;
	}
	public void setLineImg(String lineImg) {
		this.lineImg = lineImg;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Integer getEnableStatus() {
		return enableStatus;
	}
	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	public Data getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Data lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
	
	
}
