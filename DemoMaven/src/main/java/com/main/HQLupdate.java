package com.main;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HQLupdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hql="UPDATE Students set marks=100 where id=105";
		//String hql="DELETE Students where id=104";
		 Session session=Utility.getSessionFactory().openSession();
		 Transaction tr=session.beginTransaction();
		 Query qr=session.createQuery(hql);
		 int n=qr.executeUpdate();
		 tr.commit();
		 session.close();
		 System.out.println("No of rows are affected= "+n);
		 
      
	}

}
