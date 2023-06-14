package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.homedao;
import com.model.usermodel;


@WebServlet("/homecontroller")
public class homecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public homecontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equals("showuser"))
		{
			int uid=Integer.parseInt(request.getParameter("uid"));
			usermodel model=new homedao().getverify(uid);
			request.setAttribute("model",model);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		
		else if (action.equals("edituser"))
		{
			int uid=Integer.parseInt(request.getParameter("uid"));
			usermodel hmodel=new homedao().getverify(uid);
			request.setAttribute("hmodel",hmodel );
			request.getRequestDispatcher("home.jsp").forward(request, response);
			
		}
		
		else if (action.equals("deleteuser"))
		{
			int uid=Integer.parseInt(request.getParameter("uid"));
			int x=new homedao().deleteuser(uid);
			if(x>0)
			{
				request.setAttribute("msg","record deleted");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  usermodel hmodel=new usermodel();
	  hmodel.setUid(Integer.parseInt("uid"));
	  hmodel.setFirstname(request.getParameter("firstname"));
	  hmodel.setLastname(request.getParameter("lastname"));
	  hmodel.setUsername(request.getParameter("username"));
	  hmodel.setPassword(request.getParameter("password"));
	  
	  int x=new homedao().updateuser(hmodel);
	  if(x>0)
	  {
		  response.sendRedirect("homecontroller?action=shoeuser&uid="+hmodel.getUid());
	  }
	}

}
