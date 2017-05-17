package cn.Guitar.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC {
	private String sql;
	private Connection Coon;
	private PreparedStatement pstmt;
	public static Connection getConnection(){
	    try {
	    	Class.forName("org.sqlite.JDBC");
	        Connection conn = DriverManager.getConnection("jdbc:sqlite:Guitars.db");        
	        return conn;
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return null; 
    }
}
