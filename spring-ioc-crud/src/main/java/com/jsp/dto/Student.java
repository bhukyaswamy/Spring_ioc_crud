package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private int age;
	private long phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	

}
