package com.jsp.controller;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;
import com.jsp.util.MyConfig;

public class TestStudentGetById {
	public static void main(String[] args) {
		ApplicationContext aC=new AnnotationConfigApplicationContext(MyConfig.class);
		
		StudentService tS= (StudentService)aC.getBean("studentService");
		Student student =tS.getStudentById(1);
		if(student!=null) {
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getPhone());
			System.out.println();
		}
		else 
			System.out.println("please check the id..");
			
		}

}
