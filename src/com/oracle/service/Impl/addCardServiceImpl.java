package com.oracle.service.Impl;

import com.oracle.dao.addCard;
import com.oracle.dao.Impl.addCardImpl;
import com.oracle.service.addCardService;

public class addCardServiceImpl implements addCardService {

	public void addcard(String cartype, String phnum1, String phnum2) {
		addCard addcard = new addCardImpl();
		addcard.addcard(cartype, phnum1, phnum2);

	}

}
