package Tool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DAL.DBConnect;


public class TestDB {
	private static Connection con = DBConnect.getConnection();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id = 22;
		String name = "pingpong";
		String rule = "123";
		String sql2 = "INSERT project (id,name,rule) VALUES(?,?,?)";
		PreparedStatement ptmt;
		try {
			ptmt = con.prepareStatement(sql2);
			ptmt.setInt(1, id);
			ptmt.setString(2, name);
			ptmt.setString(3, rule);
			ptmt.execute();
			System.out.println("注册数据已插入logint数据表中");
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
	}

}
