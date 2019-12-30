import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
class WorkWithStream
{
public static void main(String[] args)
{
try(FileReader fis=new FileReader("abc.dat"))
{
int ch;
while((ch=fis.read())!=-1)
System.out.println((char)(ch)+" ");
//for(int i=65; i<=90; i++)
//fis.write(i);
}
catch(IOException ex)
{
System.out.println(ex);
}
}
}

