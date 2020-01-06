package com.deloitte.firstmvn.hibfirst;
import java.sql.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.deloitte.firstmvn.hibfirst.entity.Employee;
public class App 
{
    public static void main( String[] args )
    {
       Configuration config=new Configuration();
       config.configure();
       SessionFactory factory=config.buildSessionFactory();
       Employee emp=new Employee(101,"Ajay Kumar",1000.00,new Date(2020,1,6));
       Session session= factory.openSession();
       Transaction trans=session.beginTransaction();
       session.save(emp);
       trans.commit();
       session.close();
       factory.close();
    }
}
