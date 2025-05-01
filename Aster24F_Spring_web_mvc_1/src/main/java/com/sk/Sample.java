package com.sk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Sample {

	@GetMapping("/ts") // localhost:8080/Aster24F_Spring_web_mvc_1/ts (GET)
	public @ResponseBody String test() {
		return "Hello User";
	}
	
	@GetMapping("/smpdata")
	public @ResponseBody String data() {
		return "I am in data method";
	}
	
	@PostMapping("/ts")  //localhost:8080/Aster24F_Spring_web_mvc_1/ts (POST)
	public @ResponseBody String cmn() {
		return "We are using cmn method...";
	}
}



//HTTP METHODS
/*
get 	-> doGet()
post 	-> doPost()
put 	-> doPut()
delete 	-> doDelete()
*/