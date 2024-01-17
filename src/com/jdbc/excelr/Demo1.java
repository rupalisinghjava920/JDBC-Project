package com.jdbc.excelr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1 {

	public static void main(String arge[]) throws ClassNotFoundException,SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/excelrdb";
		String username="root";
		String password="root";
		
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("success...");
		
	}
}
