package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;
@Component
public class StudentService {
	@Autowired
	StudentDao dao;
	
	public Student saveStudent(Student Student) {
		return dao.saveStudent(Student);
		
	}
	public Student updateStudent(Student Student) {
		return dao.updateStudent(Student);
	}
	public List<Student> getAllStudent(){
		return dao.getAllStudent();
	}
	public Student getStudentById(int id) {
		return dao.getStudentById(id);
		
	}
	public Student deleteStudent(int id) {
		return dao.deleteStudent(id);
	}
	

}
