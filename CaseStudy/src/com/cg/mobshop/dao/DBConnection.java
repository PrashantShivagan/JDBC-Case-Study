package com.cg.mobshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cg.mobshop.exception.PurchaseException;

public class DBConnection {
	private static Connection con;
	public static Connection getConnection() throws PurchaseException{
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "System";
		String pwd = "corp123";
		
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("class Loaded");
			con = DriverManager.getConnection(url, username, pwd);
			System.out.println("Connected to db");
		} catch (SQLException e) {
			throw new PurchaseException(e.getMessage());
		} catch (ClassNotFoundException e) {
			throw new PurchaseException(e.getMessage());
		}
		
		
		return con;
		
	}

}
