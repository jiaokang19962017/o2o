package com.jk.o2o.entity;

import java.util.Date;

public class WeChatAuth {
/**
 * 微信实体类
 * */
	//id
	private Long wecharAuthId;
	//openid
	private String openId;
	//创建时间
	private Date creatTime;
	//用户信息
	private PersonInfo personInfo;
	public Long getWecharAuthId() {
		return wecharAuthId;
	}
	public void setWecharAuthId(Long wecharAuthId) {
		this.wecharAuthId = wecharAuthId;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	public PersonInfo getPersonInfo() {
		return personInfo;
	}
	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}
	
	
}
