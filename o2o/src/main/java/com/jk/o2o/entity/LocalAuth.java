package com.jk.o2o.entity;

import java.util.Date;

public class LocalAuth {
	//本地id
	private Long localAuthId;
	//用户名
	private String username;
	//密码
	private String password;
	//创建时间
	private Date createTime;
	//最后编辑时间
	private Date lastEditTiem;
	//用户信息
	private PersonInfo personInfo;
	public Long getLocalAuthId() {
		return localAuthId;
	}
	public void setLocalAuthId(Long localAuthId) {
		this.localAuthId = localAuthId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastEditTiem() {
		return lastEditTiem;
	}
	public void setLastEditTiem(Date lastEditTiem) {
		this.lastEditTiem = lastEditTiem;
	}
	public PersonInfo getPersonInfo() {
		return personInfo;
	}
	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}
	
	
}
