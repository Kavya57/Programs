package com.del.entity;
public class EmployeeTest
{
	public static void main(String[] args)
	{
	 /* Employee e= new Employee(112,"Kiran",2000,new Date(1990,11,12));
	  EmployeeDAO edao=new EmployeeDAO();
	  if(edao.insertEmployee(e))
		  System.out.println("Employee record inserted");
	  else
		  System.out.println("Insertion failed");
	  Employee e= new Employee(112,"Kiran Rao",2800,new Date(1990,11,12));
	  EmployeeDAO edao=new EmployeeDAO();
	  if(edao.modifyEmployee(e))
		  System.out.println("Employee record modified");
	  else
		  System.out.println("Modification failed");
	   EmployeeDAO edao=new EmployeeDAO();
	   ArrayList<Employee> elist=edao.getEmployee();
	   for(Employee e: elist)
		   System.out.println(e.getEmpid()+" "+e.getEname()+" "+e.getSalary());
		EmployeeDAO edao=new EmployeeDAO();
		Employee e=edao.getEmployee(103);
		if(e!=null)
			System.out.println(e.getEmpid()+" "+e.getEname()+" "+e.getSalary());
		else
			System.out.println("Employee with id 103 does not exist");*/
		EmployeeDAO edao=new EmployeeDAO();
		if(edao.removeEmployee(112))
			System.out.println("Employee deleted successfully");
		else
			System.out.println("Employee with id 103 does not exist");
	}
}
