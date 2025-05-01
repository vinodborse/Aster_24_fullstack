package com.sk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller +  @ResponseBody
public class User {

	@PostMapping("/name")
	public  String userName() {
		return "User name is VINOD";
	}
	
	@PostMapping("/udata")
	public String userData() {
		return "this is user data method";
	}

	@GetMapping("/udetails")
	public String details() {
		return "We need to see user details here...";
	}
}
