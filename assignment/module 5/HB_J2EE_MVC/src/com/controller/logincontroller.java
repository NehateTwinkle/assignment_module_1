package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.hbdao;
import com.dao.logindao;
import com.model.usermodel;


@WebServlet("/logincontroller")
public class logincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public logincontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		usermodel lmodel=new usermodel();
		lmodel.setUsername(request.getParameter("username"));
		lmodel.setPassword(request.getParameter("password"));
		
		usermodel model=new logindao().getlogin(lmodel);
		if(model!=null)
		{
			HttpSession session=request.getSession(true);
			session.setAttribute("model",model);
			response.sendRedirect("homecontroller?action=showuser&uid="+model.getUid());
			
		}
	}

}
