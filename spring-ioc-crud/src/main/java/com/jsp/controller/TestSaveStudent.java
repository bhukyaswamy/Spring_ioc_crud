package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;
import com.jsp.util.MyConfig;

public class TestSaveStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(2);
		student.setName("sai");
		student.setAge(32);
		student.setPhone(5592937392l);
		ApplicationContext aC=new AnnotationConfigApplicationContext(MyConfig.class);
		StudentService service=(StudentService)aC.getBean("studentService");
		Student student2=service.saveStudent(student);
		
		if(student2!=null) {
			System.out.println("data saved");
			
		}
		else 
			System.out.println("please check the object..");

	}
}
