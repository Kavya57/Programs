package com.deloitte.thirdmvn.hibthird;
import java.sql.Date;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.deloitte.thirdmvn.hibthird.entity.Course;
import com.deloitte.thirdmvn.hibthird.entity.Student;
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.addAnnotatedClass(Course.class);
    	cfg.addAnnotatedClass(Student.class);
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Course c=session.get(Course.class, 7001);
    	if(c!=null)
    	{
    		System.out.println(c.getCname()+" "+c.getDuration());
    		for(Student s: c.getSlist())
    			System.out.println(s.getSid()+" "+s.getSname()+" "+s.getAddress());
     	}
    	Student s=session.get(Student.class, 103);
    	if(s!=null)
    	{
    		System.out.println(s.getSname()+" "+s.getAddress());
    		for(Course c1 : s.getClist())
    			System.out.println(c1.getCid()+" "+c1.getCname()+" "+c1.getDuration());
    	}
    	session.close();
    	factory.close();
    }
}
