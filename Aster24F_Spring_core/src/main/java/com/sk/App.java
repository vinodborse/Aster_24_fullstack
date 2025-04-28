package com.sk;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	
    	Teacher t1 = new Teacher();
    	System.out.println(t1);
    	Teacher t2 = new Teacher();
    	System.out.println(t2);
    	Teacher t3 = new Teacher();
    	System.out.println(t3);
    	
    	System.out.println("------------------");
    	
    	Common c1 = ac.getBean(Common.class, "cmn");
    	System.out.println(c1);
    	Common c2 = ac.getBean(Common.class, "cmn");
    	System.out.println(c2);
    	Common c3 = ac.getBean(Common.class, "cmn");
    	System.out.println(c3);
    	
//    	c.name();
    	
    	
    	
    }
}
