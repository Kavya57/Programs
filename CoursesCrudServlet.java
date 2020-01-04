import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.del.courses.dao.CoursesDAO;
import com.del.courses.entity.Courses;
@WebServlet("/CoursesCrudServlet")
public class CoursesCrudServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	  	response.setContentType("text/html");
	  	PrintWriter out=response.getWriter();
	  	String submit=request.getParameter("sub");
	  	CoursesDAO cdao=new CoursesDAO();
	  	Courses c=new Courses();
        String message="";
	  	RequestDispatcher rd=request.getRequestDispatcher("CoursesCrudJSP.jsp");
	  	c.setCourse_id(Integer.parseInt(request.getParameter("course_id")));
	  	if(submit.equals("Add_Course")|| submit.equals("Modify_Course"))
	  	{
	  		c.setCourse_name(request.getParameter("course_name"));
	  		c.setCourse_duration(Integer.parseInt(request.getParameter("course_duration")));
	  		c.setCourse_fee(Double.parseDouble(request.getParameter("course_fee")));
	  		if(submit.equals("Add_Course"))
	  		{
	  			cdao.insertCourses(c);
	  			message=message+" inserted record";
	  		}
	  		else
	  		{
	  			cdao.modifyCourses(c);
	  			message=message+" modified record";
	  		}
	  	}
	  	else if(submit.equals("Delete_Course"))
	  	{
	  		if(cdao.removeCourses(c.getCourse_id()))
	  			message=message+" record deleted";
	  		else
	  			message="deletion failed";
	  	}
	  	else if(submit.contentEquals("Show_Course"))
	  	{
	  		c=cdao.getCourses(c.getCourse_id());
	  		if(c!=null)
	  		request.setAttribute("course", c);
	  		else
	  			message="Course doesn't exist";
	  		/*out.println(emp.getEmpid()+" "+emp.getEname()+" "+emp.getSalary());
	  		message=message+" are the employee details";*/
	  	}
	out.println("<h1><center>"+message+"</center></h1>");
  	rd.include(request,response);
	}
}