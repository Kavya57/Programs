package com.deloitte.thirdmvn.hibthird;
import java.sql.Date;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.deloitte.thirdmvn.hibthird.entity.AadharCard;
import com.deloitte.thirdmvn.hibthird.entity.Department;
import com.deloitte.thirdmvn.hibthird.entity.Employee;
import com.deloitte.thirdmvn.hibthird.entity.Person;
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Department d=session.get(Department.class, 20);
    	if(d!=null)
    	{
    		System.out.println(d.getDeptno()+" "+d.getDname());
    		for(Employee e:d.getElist())
    			System.out.println(e.getEmpid()+" "+e.getEname()+" "+e.getSalary());
    	}
    	Employee e=session.get(Employee.class, 101);
    	if(e!=null)
    	{
    		System.out.println(e.getEname()+" "+e.getSalary());
    		System.out.println(e.getDept().getDeptno()+" "+e.getDept().getDname());
    	}
    	session.close();
    	factory.close();
    }
}
