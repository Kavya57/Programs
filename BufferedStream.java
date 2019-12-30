import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
class BufferedStream
{
public static void main(String[] args)
{
try(FileInputStream fis=new FileInputStream("abc.dat");
    BufferedInputStream bis=new BufferedInputStream(fis);
	)
{

int ch;
while((ch=bis.read())!=-1)
System.out.print((char)ch+" ");
/*
for(int i=65; i<=90; i++)
bos.write(i);*/
}
catch(IOException ex)
{
System.out.println(ex);
}
}
}

