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
			// 1.������������
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.������ݿ������
			conn = DriverManager.getConnection(URL, NAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// �����ṩһ����������ȡ���ݿ�����
	public static Connection getConnection() {
		return conn;
	}
	// �ͷ���Դ���ر�connection
	public static void closecon() {
		// ���conn���գ��ر�conn
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
