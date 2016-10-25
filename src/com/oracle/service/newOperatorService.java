package com.oracle.service;

public interface newOperatorService {

	public void addnewpoerator(String loginid,String username,String password,boolean ifmanager);
	public void updateoperator(int uid,String loginid, String username, String password,
			boolean ifmanager);
}
