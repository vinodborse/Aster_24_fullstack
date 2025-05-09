package com.sk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @ResponseBody
public class SampleController {

	@GetMapping("/test")
	public String test () {
		return "Our app is working fine...";
	}
}
