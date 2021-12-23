package com.example.demo.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Component;

import com.example.demo.LoginInterface;
import com.example.demo.MySQLConnection;
@Component
public class LoginImpl implements LoginInterface {
@Autowired
MySQLConnection mySQLConnectionImpl;
	@Override
	public boolean ValidateUser(User u) throws SQLException {
		// TODO Auto-generated method stub
		boolean st =false;
        
            Connection con =mySQLConnectionImpl.getConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("select password from userdetails  ");
            
          
            
            ResultSet rs =(ResultSet) ps.executeQuery();
            String str=u.getPassword();
            
            while(rs.next()) {
            	String compareTo=rs.getString("password");
           
            if( str.equals(compareTo))
    			    {
    			    return st=true;
    			    }
            }
    		
            
        return st;

         
	}

}
