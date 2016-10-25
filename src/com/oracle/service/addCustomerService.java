package com.oracle.service;

public interface addCustomerService {

	public void addcustomer(String idtype,String idcard,String customername,String sex,String birthday,String address);
	public void addcard(long phonenum, String manyou, String tonghua,
			String idcard);
}
