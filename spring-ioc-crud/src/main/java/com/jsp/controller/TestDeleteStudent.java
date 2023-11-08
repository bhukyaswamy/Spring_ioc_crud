package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;
import com.jsp.util.MyConfig;

public class TestDeleteStudent {
	public static void main(String[] args) {
		ApplicationContext aC=new AnnotationConfigApplicationContext(MyConfig.class);
		StudentService tS= (StudentService)aC.getBean("studentService");
		Student student =tS.deleteStudent(5);
			if(student!=null) {
				System.out.println("data is deleted");
				
			}
			else 
				System.out.println("please check the id");
	}

}
