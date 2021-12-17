package com.sonata.LoginServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sonata.service.impl.LoginImpl;
import com.sonata.service.*;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		LoginInterface Login=new LoginImpl();
		boolean flag = true;
		try {
			flag = Login.validateUser(request.getParameter("uname"), request.getParameter("pword"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(flag==true) {
			out.println("login was successfull");
			
		}
		else {
			out.println("logged in failed, please check username and password !");
			
		}
		}
	}

	
	

