package com.oracle.dao.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.oracle.dao.LoginDao;
import com.oracle.po.Users;
import com.oracle.util.getSession;

public class LoginDaoImpl implements LoginDao {

	public Users finduser(String username) {
		getSession s = new getSession();
		Session session = s.gets();
		session.beginTransaction();
		Query query = session.createQuery("from Users");
		List<Users> list =query.list();
		Users user = new Users();
		for(Users u:list){
			
			if(u.getName().equals(username)){
				user.setName(u.getName());
				user.setPassword(u.getPassword());
				user.setIfmanager(u.isIfmanager());
				user.setLoginid(u.getLoginid());
				user.setUid(u.getUid());
			}
		}
		return user;
	}

}
