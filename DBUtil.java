package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
	private static final String URL = "jdbc:oracle:thin:@10.9.0.225:1521:XE";
	private static final String NAME = "system";
	private static final String PASSWORD = "123456";

	private static Connection conn = null;
	static {
		try {
			// 1.加载驱动程序
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.获得数据库的连接
			conn = DriverManager.getConnection(URL, NAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 对外提供一个方法来获取数据库连接
	public static Connection getConnection() {
		return conn;
	}
	// 释放资源，关闭connection
	public static void closecon() {
		// 如果conn不空，关闭conn
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
