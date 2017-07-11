package com.js.service;

import java.util.List;

import com.js.dto.Student;

public interface StudentService {

	public String saveStudent(Student student) throws Exception;
	public String deleteStudent(Student student) throws Exception;
	public String updateStudent(Student student) throws Exception;
	public Student searchStudent(Student student) throws Exception;
	public List<Student> getAllStudent() throws Exception;

}
