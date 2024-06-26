package com.db.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.entity.Students;
import com.db.service.StudentService;

public class StudentDataSearch extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read the request
		int id=Integer.parseInt(request.getParameter("t1"));
		
		//forward the request to service class
		System.out.println("Controller calling");
		StudentService stserv=new StudentService();
		Students student=stserv.findById(id);
		
		//forward the response
		request.setAttribute("Students", student);
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request,response);		
	}

}
