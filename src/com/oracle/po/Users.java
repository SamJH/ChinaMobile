package com.oracle.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {

	private int uid;
	private String loginid;
	private String name;
	private String password;
	private boolean ifmanager;
	@Id
	@GeneratedValue
	@Column(name="id")
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	@Column(name="username")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	
	
	public boolean isIfmanager() {
		return ifmanager;
	}
	public void setIfmanager(boolean ifmanager) {
		this.ifmanager = ifmanager;
	}
	public Users(String loginid,String name, String password,boolean ifmanager) {
		super();
		this.loginid = loginid;
		this.name = name;
		this.password = password;
		this.ifmanager = ifmanager;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	//更新操作员
	
	public Users(int uid,String loginid,String name, String password,boolean ifmanager) {
		super();
		this.uid = uid;
		this.loginid = loginid;
		this.name = name;
		this.password = password;
		this.ifmanager = ifmanager;
	}
	
}
