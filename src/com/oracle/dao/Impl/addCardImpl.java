package com.oracle.dao.Impl;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.oracle.dao.addCard;
import com.oracle.po.card;
import com.oracle.util.getSession;

public class addCardImpl implements addCard {

	public void addcard(String cartype, String phnum1,String phnum2) {
		getSession s = new getSession();
		Session session = s.gets();
		session.beginTransaction();
		long a = 13910000000L;
		long current = System.currentTimeMillis();
		for(long i=0;i<=(Long.parseLong(phnum2)-a);i++){
			card c = new card(Long.parseLong(phnum1)+i,cartype);
			session.save(c);
			if(i%10000==0){
				

				
				session.flush();
				
				session.clear();
				
				session.getTransaction().commit();
				
				session = s.gets();
				session.beginTransaction();
			}
		}
		long agertime = System.currentTimeMillis();
		System.out.println((agertime-current)/1000);

	}

}
