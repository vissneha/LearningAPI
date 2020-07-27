package com.sneha.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sneha.beans.StudentRegistration;
import com.sneha.beans.Student;

@Controller


public class StudentRetrieveController {
	@RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
	
	@ResponseBody
	public List<Student> getAllStudent(){
		return StudentRegistration.getInstance().getStudentRecords();
		
	}
	
	

}
