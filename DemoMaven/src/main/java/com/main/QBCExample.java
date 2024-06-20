package com.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;



public class QBCExample {

	public static void main(String[] args) {
		
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Students.class);
		//select * from students;

		//Order order1=Order.desc("marks");
		//select * from order by name asc;
		
		criteria.addOrder(Order.desc("marks"));
		
		//Order order2=Order.asc("name");
		//criteria.addOrder(order2);
		
		List<Students> student =criteria.list();	
		for(Students s1: student)
		System.out.println(s1);
	}

}
