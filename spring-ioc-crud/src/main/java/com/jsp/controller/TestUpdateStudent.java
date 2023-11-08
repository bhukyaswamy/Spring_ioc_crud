package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;
import com.jsp.util.MyConfig;

public class TestUpdateStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(3);
		student.setName("swamy");
		student.setAge(22);
		student.setPhone(999993993l);
		
		ApplicationContext aC= new AnnotationConfigApplicationContext(MyConfig.class);
		StudentService tS=(StudentService)aC.getBean("studentService");
		Student student2=tS.updateStudent(student);
		if(student2!=null) {
			System.out.println("data is updated");
		}
		else 
			System.out.println("please check the id");
	}
}
