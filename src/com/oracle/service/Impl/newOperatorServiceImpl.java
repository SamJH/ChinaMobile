package com.oracle.service.Impl;

import com.oracle.dao.newOperatorDao;
import com.oracle.dao.Impl.newOperatorDaoImpl;
import com.oracle.service.newOperatorService;

public class newOperatorServiceImpl implements newOperatorService {

	public void addnewpoerator(String loginid, String username,
			String password, boolean ifmanager) {
		newOperatorDao addoperator = new newOperatorDaoImpl();
		addoperator.addpoerator(loginid, username, password, ifmanager);

	}

	public void updateoperator(int uid, String loginid, String username,
			String password, boolean ifmanager) {
		newOperatorDao updateopertar = new newOperatorDaoImpl();
		updateopertar.updateoperator(uid, loginid, username, password, ifmanager);
	}

}
