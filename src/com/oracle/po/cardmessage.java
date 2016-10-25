package com.oracle.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class cardmessage {
	
	private int id;
	private long phonenum;
	private String manyou;
	private String tonghua;
	private String idcard;
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(long phonenum) {
		this.phonenum = phonenum;
	}
	public String getManyou() {
		return manyou;
	}
	public void setManyou(String manyou) {
		this.manyou = manyou;
	}
	public String getTonghua() {
		return tonghua;
	}
	public void setTonghua(String tonghua) {
		this.tonghua = tonghua;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public cardmessage( long phonenum, String manyou, String tonghua,
			String idcard) {
		super();
		
		this.phonenum = phonenum;
		this.manyou = manyou;
		this.tonghua = tonghua;
		this.idcard = idcard;
	}
	public cardmessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
