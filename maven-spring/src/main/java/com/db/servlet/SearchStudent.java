package com.db.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.db.entity.Students;


public class SearchStudent extends HttpServlet {
	

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter p=response.getWriter();
		String s1=request.getParameter("r1");
		int id=Integer.parseInt(s1);

		Configuration config = new Configuration().configure();
		SessionFactory sf= config.buildSessionFactory();
		Session session= sf.openSession();
		Students student=session.get(Students.class,id);
		p.println("Name :" +student.getName());
		p.println("Batch :"+student.getBatch());
		p.println("Marks :"+student.getMarks());
		p.println("Joining Date :"+student.getDOJ());
		session.close();
	
}

}
