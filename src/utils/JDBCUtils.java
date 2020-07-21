package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
	public static Connection getConnection() {
		Properties pro = new Properties();
		String name = "";
		String password ="";
		String url = "";
		String driverClass = "";

		Connection conn = null;
		try {
			InputStream file = null;
			file =JDBCUtils.class.getClassLoader().getResourceAsStream("information.properties");
			try {
				pro.load(file);
				 name = pro.getProperty("name");
				 password = pro.getProperty("password");
				 url = pro.getProperty("url");
				 driverClass = pro.getProperty("driverClass");
				 
			} catch (IOException e) {
				e.printStackTrace();
			}
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, name, password);
			return conn;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void closeResourse(Connection conn, PreparedStatement ps, ResultSet rs) {
		try {
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeResourse(Connection conn, PreparedStatement ps) {
		try {
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
