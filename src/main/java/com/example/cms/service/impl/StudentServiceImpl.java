package com.example.cms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cms.entity.Student;
import com.example.cms.repository.StudentRepository;
import com.example.cms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
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
