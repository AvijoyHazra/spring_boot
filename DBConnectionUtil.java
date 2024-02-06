package Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionUtil {
	private static final String username = "sql6682409";
	private static final String password = "H5UwwwdnIU";
	private static final String jdbcURL = "jdbc:mysql://sql6.freesqldatabase.com:3306/sql6682409";
	private static final String driver = "com.mysql.cj.jdbc.Driver";

	private static Connection connection = null;

	public static Connection openConnection() {
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(jdbcURL, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
