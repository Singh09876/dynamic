package com.rays.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class jdbcDataSource {

	
  private	static jdbcDataSource  jds = null;
	private  ComboPooledDataSource cpds = null;
ResourceBundle rb=	ResourceBundle.getBundle("in.co.rays.bundle.system");
	
	private jdbcDataSource() {
		
		
		
		try 
		{ cpds = new ComboPooledDataSource();

		cpds.setDriverClass(rb.getString("driver"));
		cpds.setJdbcUrl(rb.getString("url"));
		cpds.setUser(rb.getString("username"));
		cpds.setPassword(rb.getString("password"));
		cpds.setInitialPoolSize(Integer.parseInt(rb.getString("initialPoolSize")));
		cpds.setAcquireIncrement(Integer.parseInt(rb.getString("acquireIncrement")));
		cpds.setMaxPoolSize(Integer.parseInt(rb.getString("maxPoolSize")));
			
		}catch (Exception e) {
e.printStackTrace();
		}
	}
	
	public static jdbcDataSource getInstance() {
		if (jds==null) {
			jds = new jdbcDataSource();
		}
		return jds;
		
	}
	public static Connection getConnection() {
		try {
			return getInstance().cpds.getConnection();	
		}catch (Exception e) {
        return null;
		}
	}
	
	public static void  closeConnection (Connection conn, Statement stmt,
			ResultSet rs) {
		try {
			if (rs != null)rs.close();
			if (stmt !=null)stmt.close();
			if (conn !=null) conn.close();
		}catch (Exception e) {
e.printStackTrace();
		
		}
	}
	
	public static void  closeConnection ( 
		Connection conn, Statement stmt) {
		closeConnection(conn, stmt ,null);
	}
	
	public static void  closeConnection ( 
			Connection conn) {
		closeConnection(conn,null,null);
	}
		
}
