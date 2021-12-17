package com.sonata.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.servlet.http.HttpServlet;


import com.sonata.service.LoginInterface;
import com.sonata.service.MySQLConnection;

/**
 * Servlet implementation class LoginImpl
 */

public class LoginImpl implements LoginInterface {
	public boolean validateUser(String uname, String pword) throws SQLException {
		boolean st =false;
        try {

            //loading drivers for mysql
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating connection with the database
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","admin@123");
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("select password from userdetails where username = ?   ");
            
            ps.setString(1, uname);
            
            ResultSet rs =(ResultSet) ps.executeQuery();
            st = rs.next();
            if( rs.getString("password").equals(pword))
    			    {
    			    return true;
    			    }else
    			    {
    			    return false;
    			    }
    		
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;  

	}
}