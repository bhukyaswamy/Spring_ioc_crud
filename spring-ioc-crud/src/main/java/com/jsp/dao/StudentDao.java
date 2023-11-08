package com.jsp.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dto.Student;
import java.util.List;
@Component
	public class StudentDao {
		@Autowired
		EntityManagerFactory eMF; // it will create the object and stored into variable...
		
		public Student saveStudent(Student student) {
			EntityManager eM=eMF.createEntityManager();
			EntityTransaction eT=eM.getTransaction();
			
			if(student!=null) {
				eT.begin();
				eM.persist(student);
				eT.commit();
			}
			return student;
		}
		  
		public Student updateStudent(Student student) {
			
			EntityManager eM=eMF.createEntityManager();
			EntityTransaction eT=eM.getTransaction();
			Student student1 = eM.find(Student.class, student.getId());
			if(student1!=null) {
				eT.begin();
				eM.merge(student);
				eT.commit();
				
			}
			return student;
		}

		public List<Student> getAllStudent(){
		EntityManager eM=eMF.createEntityManager();
		Query query=eM.createQuery("select a from Student a");
		return query.getResultList();
		}
		
		public Student getStudentById(int id) {
			EntityManager eM=eMF.createEntityManager();
			return eM.find(Student.class, id);
			
		}
		
		
		public Student deleteStudent(int id) {
			
			EntityManager eM=eMF.createEntityManager();
			EntityTransaction eT=eM.getTransaction();
			Student student = eM.find(Student.class, id);
			if(student!=null) {
				eT.begin();
				eM.remove(student);
				eT.commit();
				
			}
			return student;
		}
		

	}



