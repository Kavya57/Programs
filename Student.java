package com.deloitte.java.entity;
public class Student extends Person
{
    int rno, m1,m2;
	public Student() { }
	
	public Student(int ssn, int age, String name,int rno, int m1, int m2)
	{
		super(ssn, age, name);
		this.rno = rno;
		this.m1 = m1;
		this.m2 = m2;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	} 
}
