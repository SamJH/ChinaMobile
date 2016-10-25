package com.oracle.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.service.addCardService;
import com.oracle.service.Impl.addCardServiceImpl;

public class resourceServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String phnum1 = req.getParameter("T1");
		String phnum2 = req.getParameter("T2");
		String cartype = req.getParameter("MType");
		addCardService addcard = new addCardServiceImpl();
		addcard.addcard(cartype, phnum1, phnum2);
		req.getRequestDispatcher("MyHtml.html").forward(req,resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
