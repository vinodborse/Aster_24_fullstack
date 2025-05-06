package com.sk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {

	@GetMapping("/data")
	public String data() {
		return "Hello User..!!!";
	}
	
	@GetMapping("/std")
	public Student strudentDetails() {
		Student s = new Student();
		s.setRollno(1);
		s.setName("Vinod");
		s.setAddress("Pune");
		
		return s;
	}
}
