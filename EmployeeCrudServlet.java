package com.del.employee.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.del.employee.dao.EmployeeDAO;
import com.del.employee.entity.Employee;
@WebServlet("/EmployeeCrudServlet")
public class EmployeeCrudServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	  	response.setContentType("text/html");
	  	PrintWriter out=response.getWriter();
	  	String submit=request.getParameter("sub");
	  	EmployeeDAO edao=new EmployeeDAO();
	  	Employee e=new Employee();
	  	String message="";
	  	if(submit.contentEquals("View_ALL"))
		 {
		  		ArrayList<Employee> elist=edao.getEmployee();
		  		for(Employee e1:elist)
		  		{
		  			out.println(e1.getEmpid()+" "+e1.getEname()+" "+e1.getSalary());
		  			out.println("<br>");
		  		}
		  		message=message+" all the employees";
		 }
	  	else
	  	{
	  	e.setEmpid(Integer.parseInt(request.getParameter("empid")));
	  	if(submit.equals("Add_Employee")|| submit.equals("Modify_Employee"))
	  	{
	  		e.setEname(request.getParameter("empname"));
	  		e.setSalary(Double.parseDouble(request.getParameter("salary")));
	  		e.setDoj(Date.valueOf(request.getParameter("doj")));
	  		if(submit.equals("Add_Employee"))
	  		{
	  			edao.insertEmployee(e);
	  			message=message+" inserted record";
	  		}
	  		else
	  		{
	  			edao.modifyEmployee(e);
	  			message=message+" modified record";
	  		}
	  	}
	  	else if(submit.equals("Delete_Employee"))
	  	{
	  		if(edao.removeEmployee(e.getEmpid()))
	  			message=message+" record deleted";
	  		else
	  			message="deletion failed";
	  	}
	  	else if(submit.contentEquals("Show_Employee"))
	  	{
	  		Employee emp=edao.getEmployee(e.getEmpid());
	  		out.println(emp.getEmpid()+" "+emp.getEname()+" "+emp.getSalary());
	  		message=message+" are the employee details";
	  	}
	  }
	  	out.println(message);
}
}
