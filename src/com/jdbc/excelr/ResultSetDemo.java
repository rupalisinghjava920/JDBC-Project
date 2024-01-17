package com.jdbc.excelr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {

	public static void main(String[] args) throws ClassNotFoundException ,SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelrdb","root","root");
		//crating statement object
		Statement statement = con.createStatement();
		
		ResultSet resultset = statement.executeQuery("select * from student");
		while(resultset.next()) {
			System.out.println(resultset.getInt(1)+ " " +
		                       resultset.getString(2)+ " "+
					           resultset.getString(3)+" "+ 
		                       resultset.getString(4));
		}
	}
}
