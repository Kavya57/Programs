import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class EmployeeBufferTest
{
 public static void main(String[] args)
 {
   EmployeeBuffer e=new EmployeeBuffer(786,"John Miller",25000.00);
   try(FileOutputStream fos=new FileOutputStream("emp.dat");
       ObjectOutputStream oos=new ObjectOutputStream(fos);)
    {
	  oos.writeObject(e);
	}
   catch(IOException ex)
   {
     System.out.println(ex);
   }
 }
}