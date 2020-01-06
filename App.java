package com.deloitte.firstmvn.hibfirst;
import java.sql.Date;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.deloitte.firstmvn.hibfirst.entity.Employee;
public class App 
{
    public static void main( String[] args )
    {
       Properties prop=new Properties();
       prop.put("hibernate.connection.driver_class","oracle.jdbc.driver.OracleDriver");
       prop.put("hibernate.connection.url","jdbc:oracle:thin:@localhost:1521:orcl");
       prop.put("hibernate.connection.username","scott");
       prop.put("hibernate.connection.password","tiger");
       prop.put("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
       prop.put("hibernate.show_sql","true");
       Configuration config=new Configuration();
       config.addAnnotatedClass(Employee.class);
       config.addProperties(prop);
       SessionFactory factory=config.buildSessionFactory();
       Session session= factory.openSession();
       Employee e = session.get(Employee.class, 101);
       if(e!=null)
    	   System.out.println(e.getEname()+" "+e.getSalary()+" "+e.getDoj());
       session.close();
       factory.close();
    }
}
