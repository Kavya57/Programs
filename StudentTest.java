import java.sql.Date;
import java.util.ArrayList;
public class StudentTest
{
	public static void main(String[] args)
	{
     StudentDAO sdao= new StudentDAO();
	 /*Student s= new Student(124,"Vijay",24, new Date(1980,8,12));
	 if(sdao.insertStudent(s))
		 System.out.println("Student is inserted");
	 else
		 System.out.println("Insertion failed");
     Student std=sdao.getStudent(123);
     if(std!=null)
    	 System.out.println(std.getRno()+" "+std.getName()+" "+std.getAge());
     else
    	 System.out.println("Student with rno 123 is not found");
     Student std= new Student(123,"Kiran",28,new Date(1990,11,12));
	 if(sdao.modifyStudent(std))
		  System.out.println("Student record modified");
	 else
		  System.out.println("Modification failed");
	 if(sdao.removeStudent(103))
			System.out.println("Student deleted successfully");
	 else
			System.out.println("Student with rno 103 does not exist");*/
     ArrayList<Student> slist=sdao.getStudent();
	 for(Student std: slist)
		 System.out.println(std.getRno()+" "+std.getName()+" "+std.getAge()+" "+std.getDob());
	}

}
