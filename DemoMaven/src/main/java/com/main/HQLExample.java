package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class HQLExample {

	public static void main(String[] args) {
		
		Session session=Utility.getSessionFactory().openSession();
	
		String sql="FROM Students where batch='core java' and marks>70" +
		              "order by marks desc";
		
		
		Query query=session.createQuery(sql);
		
		List<Students> student=query.list();
		for(Students s:student)
		{
			System.out.println(s);
		}
		session.close();
		
	}

}
