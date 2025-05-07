package com.sk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.sk.model.Student;

@Service
public class StudentService {

	List<Student> students = new ArrayList<Student>();
	
	public Student studentDetails() {
		Student std = new Student(1, "Don", "Mumbai");
		return std;
	}
	
	public Student addStudentUsingPathVariable(int rollno, String name, String address) {
		Student std = new Student();
		std.setRollno(rollno);
		std.setName(name);
		std.setAddress(address);
		students.add(std);
		return std;
	}
	
	public Student addStudentUsingRequestParam(int rollno, String name, String address) {
		Student std = new Student();
		std.setRollno(rollno);
		std.setName(name);
		std.setAddress(address);
		students.add(std);
		return std;
	}
	
	public Student addStudentUsingRequestBody(Student student) {
		Student std = student;
		students.add(student);
		System.out.println("STUDENT COUNT:- "+ students.size());
		return std;
	}
	
	
	public Student findStudentByRollno(int rollno) {
		Student s = new Student();
		for(int j = 0; j<students.size(); j++) {
			if(rollno == students.get(j).getRollno()) {
				s = students.get(j);
				break;
			}
		}
		
//		for(Student std : students) {
//			if(rollno == std.getRollno()) {
//				s = std;
//				break;
//			}
//		}
		
		return s;
	}
}
