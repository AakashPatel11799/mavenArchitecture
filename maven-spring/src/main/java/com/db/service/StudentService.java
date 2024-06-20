package com.db.service;

import com.db.dao.StudentDao;
import com.db.entity.Students;

public class StudentService {

	private  StudentDao studDao;
	public StudentService() 
	{
		studDao=new StudentDao();
	}
	public Students findById(int id)
	{
		System.out.println("seervice called ");
		return studDao.findById(id);	
	}
	
}
