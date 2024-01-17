package com.jdbc.excelr.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo2 {

	public static void main(String[] args) throws ClassNotFoundException ,SQLException{
		 
		 /* preparedstatement is precomplied
		  * or
		  * parameterized statement/query
		  */
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/excelrdb";
		String username = "root";
		String password = "root";
		Connection conntection = DriverManager.getConnection(url, username, password);
		
		PreparedStatement perparedStatement = conntection.prepareStatement("insert into student values(?,?,?,?)");
		//? - is a placeholder we can replace with values
		perparedStatement.setInt(1,9);
		perparedStatement.setString(2,"Maa");
		perparedStatement.setString(3,"Good");
		perparedStatement.setString(4,"A");
		
		int i=perparedStatement.executeUpdate();
		System.out.println("Record inserted: "+i);
		
		//retreiving all records student from table
		ResultSet resultSet=perparedStatement.executeQuery("select * from student");
		while(resultSet.next()){
			System.out.println(resultSet.getInt(1)+ " "+
		                       resultSet.getString(2)+ " "+
					           resultSet.getString(3) + " "+
		                       resultSet.getString(4));
		}
		
	}
}	

