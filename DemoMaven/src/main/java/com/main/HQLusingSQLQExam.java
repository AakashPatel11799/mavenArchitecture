package com.main;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class HQLusingSQLQExam {

	public static void main(String[] args) {

		Session session=Utility.getSessionFactory().openSession();
		
		//String sql="FROM Students where batch='core java' and marks>70" + "order by marks desc";
		
		
		//Query query=session.createQuery(sql);
		              
		 String qr="select * from Students";             
		SQLQuery sql=session.createSQLQuery(qr);
		
		List<Object []> student=sql.list();
		
		// Students s1=(Students) student;
		
		for( Object  []o1:student)
		{
			for(Object o2:o1)
			{
				System.out.print(o2+"  ");
			}
			System.out.println();
		}
		session.close();
		
	}

}
