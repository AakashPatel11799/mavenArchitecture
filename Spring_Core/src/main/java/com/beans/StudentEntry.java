package com.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class StudentEntry {

	public static void main(String[] args) {
		
           ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("info.xml");
		
		     Student1 s1=(Student1)context.getBean("s1",Student1.class);
		     System.out.println(s1);
		
	}

}
