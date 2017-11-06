package com.qianxun.yoga;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.SQLException;  
  
public class DbHelper {  
    public static final String url = "jdbc:mysql://127.0.0.1/yoga";  
    public static final String name = "com.mysql.jdbc.Driver";  
    public static final String user = "root";  
    public static final String password = "";  
  
    public static Connection conn = null;  
  
    static{
    	 try {
			Class.forName(name);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
    public static Connection getConnection(){
    	try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	return conn;
    }
} 