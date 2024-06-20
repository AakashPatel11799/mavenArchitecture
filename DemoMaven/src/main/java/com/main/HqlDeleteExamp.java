package com.main;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HqlDeleteExamp {

	public static void main(String[] args) {
		
		 String hql="DELETE Students where id=104";
		 Session session=Utility.getSessionFactory().openSession();
		 Transaction tr=session.beginTransaction();
		 Query qr=session.createQuery(hql);
		 int n=qr.executeUpdate();
		 tr.commit();
		 session.close();
		 System.out.println("No of rows are affected= "+n);
	}

}
