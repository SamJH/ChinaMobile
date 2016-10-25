package com.oracle.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.service.addCustomerService;
import com.oracle.service.Impl.addCustomerServiceImpl;

public class kaihuServelt extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		addCustomerService kaihu = new addCustomerServiceImpl();
		long phonenum = Long.parseLong(req.getParameter("phonenum"));
		String manyou = req.getParameter("manyou");
		String tonghua = req.getParameter("tonghua");
		String idcard = req.getParameter("idcard");
		String idtype = req.getParameter("idtype");
		String customername = req.getParameter("customername");
		String sex = req.getParameter("sex");
		String birthday = req.getParameter("birthday");
		String address = req.getParameter("address");
		
		kaihu.addcard(phonenum, manyou, tonghua, idcard);
		kaihu.addcustomer(idtype, idcard, customername, sex, birthday, address);
		req.getRequestDispatcher("MyHtml.html").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
