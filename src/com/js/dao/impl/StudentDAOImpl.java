package com.js.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.js.dao.StudentDAO;
import com.js.dto.Student;

public class StudentDAOImpl implements StudentDAO{
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public String saveStudent(Student student) throws Exception{
		String res = "error";
		Session session = null;
		try{
			session = sessionFactory.openSession();
			Transaction tra = session.beginTransaction();
			session.save(student);
			tra.commit();
			res = "success";
		}finally{
			if(session!=null){
				session.close();
			}
		}
		return res;
	}
	
	public String deleteStudent(Student student) throws Exception{
		String res = "error";
		Session session = null;
		try{
			session = sessionFactory.openSession();
			Transaction tra = session.beginTransaction();
			session.delete(student);			
			tra.commit();
			res = "success";
		}finally{
			if(session!=null){
				session.close();
			}
		}
		return res;
	}
	
	public String updateStudent(Student student) throws Exception{
		String res = "error";
		Session session = null;
		try{
			session = sessionFactory.openSession();
			Transaction tra = session.beginTransaction();
			session.update(student);			
			tra.commit();
			res = "success";
		}finally{
			if(session!=null){
				session.close();
			}
		}
		return res;
	}
	
	public Student searchStudent(Student student) throws Exception{
		Student s = null;
		Session session = null;
		try{
			session = sessionFactory.openSession();
			s = (Student)session.get(Student.class,student.getRoll());			
		}finally{
			if(session!=null){
				session.close();
			}
		}
		return s;
	}
	
	public List<Student> getAllStudent() throws Exception{
		List <Student>studentList = new ArrayList<Student>();
		Session session = null;
		try{
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(Student.class);
			studentList = criteria.list();
		}finally{
			if(session!=null){
				session.close();
			}
		}
		return studentList;
	}
}
