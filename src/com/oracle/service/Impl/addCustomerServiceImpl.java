package com.oracle.service.Impl;

import com.oracle.dao.cardDao;
import com.oracle.dao.newCustomerDao;
import com.oracle.dao.Impl.cardDaoImpl;
import com.oracle.dao.Impl.newCustomerDaoImpl;
import com.oracle.service.addCustomerService;

public class addCustomerServiceImpl implements addCustomerService {

	public void addcustomer(String idtype, String idcard, String customername,
			String sex, String birthday, String address) {
		newCustomerDao cus = new newCustomerDaoImpl();
		cus.addcustomer(idtype, idcard, customername, sex, birthday, address);

	}

	public void addcard(long phonenum, String manyou, String tonghua,
			String idcard) {
		cardDao card = new cardDaoImpl();
		card.addcard(phonenum, manyou, tonghua, idcard);

	}

}
