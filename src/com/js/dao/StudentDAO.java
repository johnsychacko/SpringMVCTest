package com.js.dao;

import java.util.List;

import com.js.dto.Student;


public interface StudentDAO {
	public String saveStudent(Student student) throws Exception;
	public String deleteStudent(Student student) throws Exception;
	public String updateStudent(Student student) throws Exception;
	public Student searchStudent(Student student) throws Exception;
	public List<Student> getAllStudent() throws Exception;
}
