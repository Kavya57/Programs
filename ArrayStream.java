import java.io.File;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
class ArrayStream
{
public static void main(String[] args)
{
byte arr[]={10,20,30,40};
try(ByteArrayInputStream bis=new ByteArrayInputStream(arr))
{
int ch;
while((ch=bis.read())!=-1)
System.out.println(ch+" ");
//for(int i=65; i<=90; i++)
//fis.write(i);
}
catch(IOException ex)
{
System.out.println(ex);
}
}
}

