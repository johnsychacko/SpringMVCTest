package com.js.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.js.dto.Student;
import com.js.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(value="/openaddstudent",method=RequestMethod.GET)
	public String openAddStudentForm(){
		return "admin/addstudent";
	}
	
	@RequestMapping(value="/addstudent",method=RequestMethod.POST)
	public ModelAndView addStudent(Student student){
		ModelAndView modelAndView = new ModelAndView("admin/addstudent");
		try{
			String res = studentService.saveStudent(student);
			modelAndView.addObject("BOOK_MSG",res);
		}catch(Exception e){
			modelAndView.addObject("BOOK_MSG",e.getMessage());
		}
		return modelAndView;
	}
	
	@RequestMapping(value="/opendeletestudent",method=RequestMethod.GET)
	public ModelAndView openDeleteStudent(){
		ModelAndView modelAndView = new ModelAndView("admin/deletestudent");
		return modelAndView;
	}
	
	@RequestMapping(value="/deletestudentdone",method=RequestMethod.POST)
	public ModelAndView deleteStudent(Student student){
		ModelAndView modelAndView = new ModelAndView("admin/deletestudent");
		try{
			String res = studentService.deleteStudent(student);
			modelAndView.addObject("BOOK_MSG", res);
		}catch(Exception e){
			modelAndView.addObject("BOOK_MSG", e.getMessage());
		}
		return modelAndView;
	}
	
	
}
