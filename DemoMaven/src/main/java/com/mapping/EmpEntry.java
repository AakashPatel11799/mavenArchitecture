package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Emp e1=new Emp(101,"ram",15000,new Laptop("L1","Dell",50000));
		Emp e2=new Emp(102,"aman",19000,new Laptop("L2","Hp",70000));
		Emp e3=new Emp(103,"sita",5000,new Laptop("L3","Apple",15000));
		Configuration config = new Configuration().configure();
		SessionFactory sf= config.buildSessionFactory();
		Session session= sf.openSession();
		Transaction tr=session.beginTransaction();
		tr.commit();
		session.save(e1);
	}

}
