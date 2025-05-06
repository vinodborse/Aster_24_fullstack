package com.sk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Common {

	@GetMapping("/test")
	public String test() {
		return "We are using common class";
	}
}
