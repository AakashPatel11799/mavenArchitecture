package com.db;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentInfo {

	public static void main(String[] args) {
    
		 /* Student s1=new Student();
		  * old way of creating object
		  s1.setId(101);
		  s1.setName("ram");
		  System.out.println(s1.toString()); */

		//now here we will ask for the object to spring container  
		//step -1 creating the spring container object;
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext ("info.xml");
		
		//step-2 call the getBean method for demanding object 
		Student s1=context.getBean("s1",Student.class);
		Address a1=context.getBean("a1",Address.class);
		//s1.setId(101);
		//s1.setName("ram");
		 System.out.println(s1.toString());

		 System.out.println(a1.toString());
		
	}

}
