package com.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentData {

	public static void main(String[] args) {
	
		/*Address a1=new Address();
		a1.setHouseNo("124/3");
		a1.setStreet("shiv mandir chouk chichgohan");
		a1.setCity("Khandwa");
		a1.setState("madhya Pradesh");
		
		Student s1=new Student();
		s1.setId(101);
		s1.setName("Aakash");
		s1.setAddress(a1);
	
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("info.xml");
		Student1 s1=context.getBean("s1",Student1.class);
		
		List<String> email= new ArrayList<String>();
		email.add("abc@gmail.com");
		email.add("sky@1417gmail.com");
		
		s1.setEmail(email);
		System.out.println(s1);
		*/
		
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("info.xml");
		Student1 s1=context.getBean("s1",Student1.class);
		System.out.println(s1);
		
		
		
	}

}