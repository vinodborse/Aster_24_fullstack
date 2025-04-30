package com.sk;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Common {

/*	
	@Before("execution(public void studentData())")
	public void extra1() {
		System.out.println("----- Welcome we are from common class -----");
	}
*/	
/*	
	@After("execution(public void studentData())")
	public void extra2() {
		System.out.println("---Bye---");
	}
*/	
/*	
	@Around("execution(public void studentData())")
	public void extra3(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("This is new data");
		System.out.println("This is new data for testing");
		System.out.println("This is new data in new method");
		
		pjp.proceed();
		
		System.out.println("This is new data for my class");
		System.out.println("Ok bye");
	}
*/
	
	@Before("execution(public void *Data())")
	public void extra1() {
		System.out.println("----- Welcome we are from common class -----");
	}

}
