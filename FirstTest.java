

import com.deloitte.java.entity.Employee;

public class FirstTest
{

	public static void main(String[] args)
	{
       Employee e=new Employee(10,"John",20000);
       System.out.println(e.getEmpId()+" "+e.getEname()+" "+e.getSalary());
	}

}
