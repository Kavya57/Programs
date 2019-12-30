package com.deloitte.java.entity;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
class StudentDeserialisation
{
 public static void main(String[] args)
 {
   Student std=null;
   try(FileInputStream fis=new FileInputStream("std.dat");
       ObjectInputStream ois=new ObjectInputStream(fis);)
    {
	  std=(Student)ois.readObject();
	  System.out.println(std.getAge()+" "+std.getName()+" "+std.getSsn()+);
	}
   catch( IOException | ClassNotFoundException ex)
   {
     System.out.println(ex);
   }
 }
}