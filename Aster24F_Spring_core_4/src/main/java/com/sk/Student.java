package com.sk;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	private Batch b;

	@Autowired
	Marks m;
	
	public void sName() {
		System.out.println("We are in student name method");
		b.bData();
	}
	
	public void sData() {
		System.out.println("We are in student data method");
		b.bData();
		m.studentMarks();
	}
}
