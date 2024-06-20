package com.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Criterion;

public class QBCRestriction {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Students.class);
		//eq=equals
//		Criterion crt1=Restrictions.eq("batch","core java");//colm name 1st parameter,property(restriction)
//		criteria.add(crt1);
//		Criterion crt2=Restrictions.ge("marks",70);
//		criteria.add(crt2);
		
//		Criterion crt1=Restrictions.in("batch","core java","collection");
//		criteria.add(crt1);
		
		Criterion crt1=Restrictions.like("name","%a");//start with name a students only
		//%a% bich me a ho work kregaS
		//a% last me a hona cahaiye only
		criteria.add(crt1);
		
		
		List<Students> student =criteria.list();	
		for(Students s1: student)
		System.out.println(s1.getName());
	}

}
