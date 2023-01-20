package com.masai.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.masai.sms.service.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//Handler Method to handle List Student Request and return model and view
	@GetMapping("/students")
	public String listStudent(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
}
