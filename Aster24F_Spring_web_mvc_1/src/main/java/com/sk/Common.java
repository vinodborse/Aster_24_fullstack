package com.sk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Common {

	@PutMapping("/dsp")
	public String dispaly() {
		return "We are creating out own API's";
	}
	
	@GetMapping("/student-details")
	public Student stdDetails() {
		Student s = new Student(1, "Vinod", "Pune");
		return s;
	}
}
