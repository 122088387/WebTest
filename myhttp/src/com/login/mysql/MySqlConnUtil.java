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
			// �������ݿ�������ע�ᵽȥ�͹�����
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/news";

			String username = "root";

			String password = "122088";

			conn = (Connection) DriverManager.getConnection(url, username, password);

			if (conn != null)

				System.out.println("���ݿ����ӳɹ�!");

			else

				System.out.println("���ݿ�����ʧ��!");

			// ��ɺ�ǵùر����ݿ�����

//			conn.close();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();

		} 
	}
	//���������еı�
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
		return "û�в鵽";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
