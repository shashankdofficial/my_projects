package com.masai.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.sms.entity.Student;
import com.masai.sms.repository.StudentRepository;
import com.masai.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
