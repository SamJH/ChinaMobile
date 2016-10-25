package com.oracle.dao;

public interface newOperatorDao {

	public void addpoerator(String loginid,String username,String password,boolean ifmanager);
	public void updateoperator(int uid,String loginid, String username, String password,
			boolean ifmanager);
}
