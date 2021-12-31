package com.sonata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Testtask {
	public static void main(String[] args) {
		Task e2 = new Task();
		e2.setTaskId(23);
		e2.setOwnerId(90);
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
		s1.beginTransaction();
		s1.save(e2);
		s1.getTransaction().commit();
	}	
}
