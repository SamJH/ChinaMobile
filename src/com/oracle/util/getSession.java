package com.oracle.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class getSession {
	private static Configuration configuration = null;
	private static SessionFactory sessionFactory = null;
	private static ServiceRegistry serviceRegistry = null;

	public Session gets(){
		try{
			configuration = new Configuration().configure();
			
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}catch(HibernateException e){
			e.printStackTrace();
		}
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
}
