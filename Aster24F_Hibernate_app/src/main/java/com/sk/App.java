package com.sk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml")
    											.addAnnotatedClass(Student.class)
    											.addAnnotatedClass(Employee.class);
    	SessionFactory  sf = cfg.buildSessionFactory();

    	Session session = sf.openSession();
    	session.beginTransaction();
    	//--------------------------------------

    		//INSERT..........
    		
    		Student std = new Student();
    		std.setName("Don");
    		std.setAddress("Mumbai");
    		session.persist(std);
    		
    	
    		Student std2 = new Student();
    		std2.setName("Pappu");
    		std2.setAddress("Delhi");
    	
    		session.persist(std2);
    		//SELECT....	
    //		Student s =  session.get(Student.class, 2);	
    //		System.out.println(s.getRollno() +" " + s.getName() +" "+ s.getAddress());

    		//UPDATE....
    	/*	Student s1 =  session.get(Student.class, 3);
    		System.out.println("BEFORE:- "+ s1.getAddress()); 
    		s1.setAddress("Delhi");
    		Student s2 =  session.get(Student.class, 3);
    		System.out.println("AFTER:- "+ s2.getAddress()); 
    	*/
    	
    		// DELETE
        	//Student s2 =  session.get(Student.class, 1);
        	//session.remove(s2);
        	
    	//--------------------------------------
    	session.getTransaction().commit();
    	session.close();
    
    }
}

/*
 	C
 	R
 	U
 	D
*/