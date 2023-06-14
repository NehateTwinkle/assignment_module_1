package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.registrationdao;
import com.model.usermodel;


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
		usermodel umodel=new usermodel();
		umodel.setFirstname(request.getParameter("firstname"));
		umodel.setLastname(request.getParameter("lastname"));
		umodel.setUsername(request.getParameter("username"));
		umodel.setPassword(request.getParameter("password"));
		
		String msg=new registrationdao().userdata(umodel);
		if(msg.equals("error"))
		{
			request.setAttribute("msg","record not inserted.");
			request.getRequestDispatcher("registration.jsp").forward(request, response);
		}
		else {
			request.setAttribute("msg","record insert");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	
	}

}
