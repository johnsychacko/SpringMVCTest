package com.js.service.impl;

import java.util.List;

import com.js.dao.StudentDAO;
import com.js.dto.Student;
import com.js.service.StudentService;

public class StudentServiceImpl implements StudentService{

	private StudentDAO studentDAO;
	
	public StudentDAO getStudentDAO() {
		return studentDAO;
	}

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	public String saveStudent(Student student) throws Exception {
		return studentDAO.saveStudent(student);
	}
	public String deleteStudent(Student student) throws Exception{
		return studentDAO.deleteStudent(student);
	}
	public String updateStudent(Student student) throws Exception{
		return studentDAO.updateStudent(student);
	}
	public Student searchStudent(Student student) throws Exception{
		return studentDAO.searchStudent(student);
	}
	public List<Student> getAllStudent() throws Exception{
		return studentDAO.getAllStudent();
	}

	
	
}
