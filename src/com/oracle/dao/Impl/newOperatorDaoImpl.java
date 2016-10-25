package com.oracle.dao.Impl;

import org.hibernate.Session;

import com.oracle.dao.newOperatorDao;
import com.oracle.po.Users;
import com.oracle.util.getSession;

public class newOperatorDaoImpl implements newOperatorDao {

	public void addpoerator(String loginid, String username, String password,
			boolean ifmanager) {
		getSession s = new getSession();
		Session session = s.gets();
		session.beginTransaction();
		Users user = new Users(loginid,username,password,ifmanager);
		session.save(user);
		session.getTransaction().commit();
		
	}
	public void updateoperator(int uid,String loginid, String username, String password,
			boolean ifmanager){
		getSession s = new getSession();
		Session session = s.gets();
		session.beginTransaction();
		Users user = new Users(uid,loginid,username,password,ifmanager);
		session.update(user);
		session.getTransaction().commit();
	}

	

}
