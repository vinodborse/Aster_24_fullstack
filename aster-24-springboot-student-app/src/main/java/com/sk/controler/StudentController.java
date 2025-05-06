package com.sk.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sk.model.Student;

@RestController
public class StudentController {

	@GetMapping("/student")
	public Student studentDetails() {
		Student std = new Student(1, "Don", "Mumbai");
		return std;
	}
	
	//localhost:8080/add-student-path/2/Rahul/Pune
	@PostMapping("/add-student-path/{rn}/{name}/{add}") 
	public Student addStudentUsingPathVariable(@PathVariable("rn")	int rollno, 
							  @PathVariable("name")	String name, 
							  @PathVariable("add")	String address) {
		Student std = new Student();
		std.setRollno(rollno);
		std.setName(name);
		std.setAddress(address);
		return std;
	}
	
	//localhost:8080/add-student-request?rn=2&name=Don&add=Mumbai
	//localhost:8080/add-student-request?name=Don&add=Mumbai&rn=2
	@PostMapping("/add-student-request") 
	public Student addStudentUsingRequestParam(
												@RequestParam("rn")	    int rollno, 
												@RequestParam("name")	String name, 
												@RequestParam("add")	String address) {
		Student std = new Student();
		std.setRollno(rollno);
		std.setName(name);
		std.setAddress(address);
		return std;
	}
}


//PathVariable
//RequestParam
//RequestBody
