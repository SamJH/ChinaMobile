package com.oracle.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.service.LoginService;
import com.oracle.service.Impl.LoginServiceImpl;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		LoginService login = new LoginServiceImpl();
		String result = login.result(username, password, req.getSession());
		if("error".equals(result)){
			req.setAttribute("error", "用户名或密码错误");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}else{
			req.getRequestDispatcher("main.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
