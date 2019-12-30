package com.deloitte.java.entity;

import java.time.LocalDate;

public class Employee 
{
   LocalDate doj;
   int empId;
   String ename;
   double Salary;
   public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double salary) {
	Salary = salary;
}

   public Employee() 
   {
    }
public Employee(int empId, String ename, double salary) 
{
	this.empId = empId;
	this.ename = ename;
	Salary = salary;
}
}
