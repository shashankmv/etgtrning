package com.sonata.fetchtaskimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sonata.UserBean.User;
import com.sonata.fetchtaskinterface.FetchTaskInterface;

public class FetchTaskImpl implements FetchTaskInterface {

	@Override
	public boolean fetcthTask(User user) {
		boolean st =false;
        try {
        	
            //loading drivers for mysql
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating connection with the database
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/python","root","admin@123");
            PreparedStatement ps = (PreparedStatement) 
            con.prepareStatement("select username,ownerid from tsk where username=? ");
         
              

            ResultSet rs =(ResultSet) ps.executeQuery();
            st = rs.next();
            if( rs.getString("userName").equals(user))
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
