package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.regidao;
import com.model.user;


@WebServlet("/regicontroller")
public class regicontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public regicontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		user u=new user();
		u.setFname(request.getParameter("fname"));
		u.setLname(request.getParameter("lname"));
		u.setUsername(request.getParameter("username"));
		u.setEmail(request.getParameter("email"));
		u.setPassword(request.getParameter("password"));
		
		String msg=new regidao().getregistration(u);
		if(msg.equals("error"))
		{
			request.setAttribute("msg","record not inserted.");
			request.getRequestDispatcher("registration.jsp").forward(request, response);
		}
		else {
			request.setAttribute("msg","record inserted.");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}

}
