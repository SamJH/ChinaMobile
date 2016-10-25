package com.oracle.service.Impl;

import java.util.List;

import javax.servlet.http.HttpSession;


import com.oracle.dao.LoginDao;
import com.oracle.dao.Impl.LoginDaoImpl;
import com.oracle.po.Users;
import com.oracle.service.LoginService;

public class LoginServiceImpl implements LoginService {

	

	public String result(String username, String password, HttpSession session) {
		LoginDao login = new LoginDaoImpl();
		Users users = login.finduser(username);
		String results = "error";
		if(users!=null){
			if(password.equals(users.getPassword())){
				results = "success";
				session.setAttribute("currentUser", users);
			}
		}
		return results;
	}
	

}
