package com.del.first.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/fs")
public class FirstServlet extends javax.servlet.GenericServlet
{ 
   public void service(ServletRequest request, ServletResponse response) throws IOException, ServletException
  {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.print("<html><body>");
	out.println("<h1 style='color:blue; text-align:center'>");
	out.println(new java.util.Date());
	out.println("</h1>");
	out.println("</body></html>");
  }
} 
