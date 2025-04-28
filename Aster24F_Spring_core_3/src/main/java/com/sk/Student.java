package com.sk;

public class Student {

	private Batch b;
	
	
	public Batch getB() {
		return b;
	}

	public void setB(Batch b) {
		this.b = b;
	}

	public Student() {}
	
	public Student(Batch b) {
		this.b = b;
	}

	public void sName() {
		System.out.println("We are in student name method");
		b.bData();
	}
	
	public void sData() {
		System.out.println("We are in student data method");
		b.bData();
	}
}
