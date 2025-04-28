package com.sk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String url = "jdbc:mysql://127.0.0.1:3306/school";
        String username = "root";
        String password = "root";
        
        Connection connection =  DriverManager.getConnection(url, username, password);
        
        Statement st = connection.createStatement();
        
        ResultSet rs = st.executeQuery("SELECT * FROM student");

        while(rs.next()) {
            String studentName = rs.getString("name");
            String studentCity = rs.getString("city");
            System.out.println(studentName + "   "+ studentCity);        	
        }

        
        connection.close();
    }
}

/*
mobile  ---> mysql connector Driver
number	---> url, username, password
call	---> connection (createStatement)
speak   ---> executeQuery("SELECT * FROM student WHERE rollno = 1")
response --> ResultSet
cut     ---> close
*/