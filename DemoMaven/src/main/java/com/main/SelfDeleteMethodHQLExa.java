package com.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SelfDeleteMethodHQLExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=Utility.getSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		Students s1=session.get(Students.class,102);
		session.delete(s1);
		tr.commit();
		session.close();
	}

}
