package com.deloitte.java.entity;
import java.io.Serializable;

public class Person implements Serializable 
{
    int ssn,age;
    String name;
	public Person() {	}
	public Person(int ssn, int age, String name)
	{
		super();
		this.ssn = ssn;
		this.age = age;
		this.name = name;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}
