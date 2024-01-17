package com.jdbc.excelr.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DeleteRecord {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelrdb","root","root");
        PreparedStatement perparedStatement =connection.prepareStatement("Delete from student where student_id=?");
        perparedStatement.setInt(1,15);
        int i = perparedStatement.executeUpdate();
        System.out.println("Record delete: "+i);
        
        ResultSet resultSet=perparedStatement.executeQuery("select * from student");
        while(resultSet.next()) {
        	System.out.println(resultSet.getInt(1)+ " "+
                    resultSet.getString(2)+ " "+
			           resultSet.getString(3) + " "+
                    resultSet.getString(4));
        }
	}

}
