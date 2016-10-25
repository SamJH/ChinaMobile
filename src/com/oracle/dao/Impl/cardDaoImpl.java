package com.oracle.dao.Impl;

import org.hibernate.Session;

import com.oracle.dao.cardDao;
import com.oracle.po.cardmessage;
import com.oracle.util.getSession;

public class cardDaoImpl implements cardDao {

	public void addcard(long phonenum, String manyou, String tonghua,
			String idcard) {
		getSession s = new getSession();
		Session session = s.gets();
		session.beginTransaction();
		cardmessage card = new cardmessage(phonenum,manyou,tonghua,idcard);
		session.save(card);
		session.getTransaction().commit();

	}

}
