package com.sk;

import org.springframework.stereotype.Component;

@Component
public class Batch {

	public void bData() {
		System.out.println("We are in Batch data method");
	}
}



/* 
  @Component
  
  
  @Controller extends @Component
  @Service extends @Component
  @Repository extends @Component
*/