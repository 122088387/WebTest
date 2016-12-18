package com.login.mysql;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class MySqlConnUtil {
	Connection conn;
	public MySqlConnUtil() {
		
	}
	public void getConn(){
		try {
			// 加载数据库驱动，注册到去送管理器
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/news";

			String username = "root";

			String password = "122088";

			conn = (Connection) DriverManager.getConnection(url, username, password);

			if (conn != null)

				System.out.println("数据库连接成功!");

			else

				System.out.println("数据库连接失败!");

			// 完成后记得关闭数据库连接

//			conn.close();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();

		} 
	}
	//查找数据中的表
	public String serch(){
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from user");
			rs.next();
			String username = rs.getString("userName");
			String passworld = rs.getString("password");
			return username+" "+passworld;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "没有查到";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
