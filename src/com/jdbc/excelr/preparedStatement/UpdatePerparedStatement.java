package com.jdbc.excelr.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

		public class UpdatePerparedStatement {
		
			public static void main(String[] args) throws ClassNotFoundException ,SQLException{
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/excelrdb","root","root");
				PreparedStatement perparedStatement = connection.prepareStatement("update student set student_grade=? where student_id=?");
				perparedStatement.setString(1,"A");
				perparedStatement.setInt(2,11);
				int i = perparedStatement.executeUpdate();
				System.out.println("Record is update: "+i);
				
				ResultSet resultSet=perparedStatement.executeQuery("select student_id, student_grade from student");
				while(resultSet.next()) {
					System.out.println(resultSet.getInt(1)+ " "+resultSet.getString("student_grade"));
				}
			}
		}