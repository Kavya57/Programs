package com.deloitte.firstmvn.hibsecond.entity;
import com.deloitte.firstmvn.hibsecond.Employee;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@DiscriminatorValue("HourlyEmployee")
@Entity
public class HourlyEmployee extends Employee
{
  double rate;
  int hours;
  public HourlyEmployee() {}
  public HourlyEmployee(int empid,String ename,double rate, int hours) 
  {
	super(empid,ename);
	this.rate = rate;
	this.hours = hours;
  }
  public double getRate() 
  {
	return rate;
  }
  public void setRate(double rate)
  {
	this.rate = rate;
  }
  public int getHours() 
  {
	return hours;
  }
  public void setHours(int hours) 
  {
	this.hours = hours;
  }  
}
