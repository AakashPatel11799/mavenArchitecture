package com.db.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.db.entity.Students;

public class StudentDao {

	private SessionFactory sessionfactory;
	public StudentDao()
	{
	Configuration config=new Configuration().configure();
	sessionfactory=config.buildSessionFactory();
	}
	
	public Students findById(int id)
	{
		System.out.println("calling Dao");
		Session session=sessionfactory.openSession();
		System.out.println("getting data from database");
		Students student=session.get(Students.class,id);
		System.out.println("Data from Dao "+toString());
		return student;
	}
}
