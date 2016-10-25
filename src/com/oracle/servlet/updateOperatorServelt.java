package com.oracle.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.service.newOperatorService;
import com.oracle.service.Impl.newOperatorServiceImpl;

public class updateOperatorServelt extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		newOperatorService updateoperator = new newOperatorServiceImpl();
		int uid = Integer.parseInt(req.getParameter("uid"));
		String loginid = req.getParameter("id");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		boolean ifmanager = Boolean.parseBoolean(req.getParameter("ifmanager"));
		updateoperator.updateoperator(uid, loginid, username, password, ifmanager);
		req.getRequestDispatcher("MyHtml.html").forward(req,resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
