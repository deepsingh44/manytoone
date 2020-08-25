package com.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		/*
		 * Transaction txt = session.beginTransaction();
		 * 
		 * College c = new College(); c.setName("R.D.E.C");
		 * c.setAddress("Duhai");
		 * 
		 * Students s1 = new Students(); s1.setName("Deep Singh");
		 * s1.setCollege(c);
		 * 
		 * 
		 * Students s2 = new Students(); s2.setName("Shashikant Sharma");
		 * s2.setCollege(c);
		 * 
		 * 
		 * session.persist(s1); session.persist(s2);
		 * 
		 * 
		 * txt.commit(); System.out.println("success");
		 */

		// Students std=session.get(Students.class, 17);

		// System.out.println(std.getCollege().getName());

		Query q = session.createQuery("from Students s where s.college_id=:id");
		q.setParameter("id", 16);
		List<Students> ss=q.getResultList();
		for(Students s:ss){
			System.out.println(s.getName());
		}

	}
}
