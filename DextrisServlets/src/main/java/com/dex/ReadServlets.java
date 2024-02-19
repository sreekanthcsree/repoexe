package com.dex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ReadServlets extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

           String u = request.getParameter("uname");
           String p = request.getParameter("email");
           System.out.println("Username is : "+u);
           System.out.println("Password is : "+p);
           
           PrintWriter pw = response.getWriter();
           pw.write("<html>");
           pw.write("<body>");
           pw.write("Username is : "+u+"<br/>");
           pw.write("Password is : "+p+"<br/>");
           pw.write("</body>");
           pw.write("</html>");
	}

}
