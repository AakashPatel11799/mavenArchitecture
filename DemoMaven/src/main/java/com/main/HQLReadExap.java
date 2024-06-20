package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class HQLReadExap {

	public static void main(String[] args) {
		
		Session session=Utility.getSessionFactory().openSession();
		//String sql="FROM Students";//Students class ko represent kiya hai dbms to table name students hai
	//	String sql="FROM Students where batch='interview'";
		//condition or where clause in sql
		String sql="FROM Students where batch='interview' and marks>70";
		
		//to run hql query create a query Object
		Query query=session.createQuery(sql);
		//convert query into list
		List<Students> student=query.list();
		for(Students s:student)
		{
			System.out.println(s);
		}
		session.close();
		
	}

}
