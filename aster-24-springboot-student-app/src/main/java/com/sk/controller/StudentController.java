package com.sk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sk.model.Student;
import com.sk.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;

	@GetMapping("/student")
	public Student studentDetails() {
		return ss.studentDetails();
	}
	
	//localhost:8080/add-student-path/2/Rahul/Pune
	@PostMapping("/add-student-path/{rn}/{name}/{add}") 
	public Student addStudentUsingPathVariable(
												@PathVariable("rn")	int rollno, 
												@PathVariable("name")	String name, 
												@PathVariable("add")	String address) {
	
		return ss.addStudentUsingPathVariable(rollno, name, address);
	}
	
	//localhost:8080/add-student-request?rn=2&name=Don&add=Mumbai
	//localhost:8080/add-student-request?name=Don&add=Mumbai&rn=2
	@PostMapping("/add-student-request") 
	public Student addStudentUsingRequestParam(
												@RequestParam("rn")	    int rollno, 
												@RequestParam("name")	String name, 
												@RequestParam("add")	String address) {

		return ss.addStudentUsingRequestParam(rollno, name, address);
	}
	
	@PostMapping("/add-student-request-body") 
	public Student addStudentUsingRequestBody(@RequestBody Student student) {
		
		return ss.addStudentUsingRequestBody(student);
	}
	

	@GetMapping("/find-student")
	public Student findStudentByRollno(@RequestParam("rollno") int rollno) {
		return ss.findStudentByRollno(rollno);
	}
}


//PathVariable
//RequestParam
//RequestBody
