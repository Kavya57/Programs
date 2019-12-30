package com.deloitte.java.entity;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class StudentSerialisation
{
 public static void main(String[] args)
 {
   Student std=new Student(119,19SS,"Kavya",25,30,28);
   try(FileOutputStream fos=new FileOutputStream("std.dat");
       ObjectOutputStream oos=new ObjectOutputStream(fos);)
    {
	  oos.writeObject(std);
	}
   catch(IOException ex)
   {
     System.out.println(ex);
   }
 }
}