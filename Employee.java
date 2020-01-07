package com.deloitte.thirdmvn.hibthird.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Employee
{
  @Id
  int empid;
  String ename;
  double salary;
  @ManyToOne
  @JoinColumn(name="deptno")
  Department dept;
  public Employee() { }
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Employee(int empid, String ename, double salary) {
	super();
	this.empid = empid;
	this.ename = ename;
	this.salary = salary;
}
public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}

  
}
