import java.sql.Date;
public class Student
{
   int rno,age;
   String name;
   Date dob;
   public Student(int rno,String name, int age,  Date dob)
   {
	super();
	this.rno = rno;
	this.age = age;
	this.name = name;
	this.dob = dob;
   }
public int getRno() 
   {
	return rno;
   }
   public void setRno(int rno) 
   {
	this.rno = rno;
   }
   public int getAge() 
   {
	return age;
   }
   public void setAge(int age) 
   {
	this.age = age;
   }
   public String getName() 
   {
	return name;
   }
   public void setName(String name)
   {
 	this.name = name;
   }
   public Date getDob()
   {
	return dob;
   }
   public void setDob(Date dob)
   {
	this.dob = dob;
   }
   
    
}
