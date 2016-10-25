package com.oracle.service;

import javax.servlet.http.HttpSession;

public interface LoginService {
	public String result(String username,String password,HttpSession session);

}
