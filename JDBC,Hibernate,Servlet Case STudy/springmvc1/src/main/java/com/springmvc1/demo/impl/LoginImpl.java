package com.springmvc1.demo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.springmvc1.demo.LoginInterface;
import com.springmvc1.demo.MySQLConnectionInterface;
import com.springmvc1.demo.model.User;
@Component
public class LoginImpl implements LoginInterface {
	@Autowired
	MySQLConnectionInterface mySQLConnectionImpl;
		@Override
		public boolean ValidateUser( String pword) throws SQLException {
			// TODO Auto-generated method stub
			boolean st =false;
	        try {
	            Connection con =mySQLConnectionImpl.getConnection();
	            PreparedStatement ps = (PreparedStatement) con.prepareStatement("select password from userdetails  ");
	            
	          
	            
	            ResultSet rs =(ResultSet) ps.executeQuery();
	            st=rs.next();
	            
	            
	           
	            if( rs.getString("password").equals(pword))
	    			    {
	    			    return true;
	    			    }
	            else {
	            	return false;
	            }
	        }
	        catch(Exception e) {
	        	e.printStackTrace();
	        }
	        return st;

	        } 
		
}

