package com.sk;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	Teacher t;
		
	public void studentData() {
		System.out.println("We are in student data method..!!!");
		t.teacherData();
		
	}
	
	
	public void studenName() {
		System.out.println("Student name method has been used...!!!");
	}
}
