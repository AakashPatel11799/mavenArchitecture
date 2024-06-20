package com.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateMethodupdateDataExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=Utility.getSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		Students s1=session.get(Students.class,108);
		s1.setMarks(99);
        session.update(s1);
        tr.commit();
        session.close();

	}

}
