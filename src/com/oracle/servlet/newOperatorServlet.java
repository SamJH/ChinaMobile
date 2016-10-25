package com.oracle.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.service.newOperatorService;
import com.oracle.service.Impl.newOperatorServiceImpl;

public class newOperatorServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		newOperatorService addoperator = new newOperatorServiceImpl();
		String loginid = req.getParameter("id");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String passwordagain = req.getParameter("passwordagain");
		boolean ifmanager = Boolean.parseBoolean(req.getParameter("ifmanager"));
		if(password.equals(passwordagain)){
			addoperator.addnewpoerator(loginid, username, passwordagain, ifmanager);
			req.getRequestDispatcher("MyHtml.html").forward(req, resp);
		}else{
			req.setAttribute("falsemanage", "¡Ω¥Œ√‹¬Î≤ª∆•≈‰");
			req.getRequestDispatcher("newOperator.jsp");
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
