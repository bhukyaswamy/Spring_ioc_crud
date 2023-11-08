package com.jsp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;
import com.jsp.util.MyConfig;

public class TestGetAllStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext aC=new AnnotationConfigApplicationContext(MyConfig.class);
		StudentService service=(StudentService)aC.getBean("studentService");
		List<Student> list=service.getAllStudent();
		if(list.size()>0) {
			for(Student student: list) {
				System.out.println(student.getId());
				System.out.println(student.getName());
				System.out.println(student.getAge());
				System.out.println(student.getPhone());
				System.out.println("*********************");
			}
			
		}

	}

}
