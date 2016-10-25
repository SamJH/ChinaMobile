package com.oracle.dao.Impl;

import org.hibernate.Session;

import com.oracle.dao.newCustomerDao;
import com.oracle.po.Customer;
import com.oracle.util.getSession;

public class newCustomerDaoImpl implements newCustomerDao {

	public void addcustomer(String idtype, String idcard, String customername,
			String sex, String birthday, String address) {
		
		getSession s = new getSession();
		Session session = s.gets();
		session.beginTransaction();
		Customer customer = new Customer(idtype,idcard,customername,sex,birthday,address);
		session.save(customer);
		session.getTransaction().commit();

	}

}
