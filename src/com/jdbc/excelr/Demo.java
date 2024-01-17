package com.jdbc.excelr;

import java.sql.SQLException;

import java.sql.*;
public class Demo {
public static void main(String args[])throws ClassNotFoundException,SQLException {
		
		//step 1:load Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 2:create connection object
		//url username and password
		//add mysql connecter jar to our project
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelrdb","root","root");
		System.out.println("connection establishes successfully");
	}
}
