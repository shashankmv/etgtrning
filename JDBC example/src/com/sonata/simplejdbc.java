package com.sonata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class simplejdbc {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/task_management","root","admin@123");
		PreparedStatement ps=con.prepareStatement("insert into employee_table values(?,?,?)");
		ps.setInt(1, 50);
		ps.setString(2, "harsha");
		ps.setDouble(3, 789789.0);
		ps.setInt(1, 60);
		ps.setString(2, "pammi");
		ps.setDouble(3, 789767.0);
		int a=ps.executeUpdate();
		System.out.println("the no.of records updated are:"+a);
		
		
				
	}catch(ClassNotFoundException e1) {System.out.println(e1);}
	catch(SQLException e2) {e2.printStackTrace();}
}
}
