package com.oracle.po;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class card {

	private long phnum;
	private String cartype;
	
	public String getCartype() {
		return cartype;
	}
	@Id
	public long getPhnum() {
		return phnum;
	}
	public void setPhnum(long phnum) {
		this.phnum = phnum;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public card(long phnum, String cartype) {
		super();
		this.phnum = phnum;
		this.cartype = cartype;
	}
	public card() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
