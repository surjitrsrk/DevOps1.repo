package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	String uid=request.getParameter("username");
    	String pwd=request.getParameter("password");
    	
    	boolean loginStatus=false;
    	
    	if("surjit".equals(uid) && "surjit".equals(pwd))
    	{
    		loginStatus=true;
    	}
    	PrintWriter out=response.getWriter();
    	if(loginStatus)
    	{
    		out.println("Login Successful");
    	}
    	else
    	{
    		out.println("Login failed");
    	}
    	out.close();
    	
	}

}
