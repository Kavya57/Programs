import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.DataInputStream;
class DataStream
{
public static void main(String[] args)
{
/*try(FileOutputStream fos=new FileOutputStream("abc.dat");
DataOutputStream dos=new DataOutputStream(fos);)
{
int i=2147483647;
float f=12345.67F;
double d=9999999999.99;
dos.writeInt(i);
dos.writeFloat(f);
dos.writeDouble(d);*/
try(FileInputStream fos=new FileInputStream("abc.dat");
DataInputStream dos=new DataInputStream(fos);)
{
int i=dos.readInt();
float f=dos.readFloat();
double d=dos.readDouble();
System.out.println(i);
System.out.println(f);
System.out.println(d);
}
catch(IOException ex)
{
System.out.println(ex);
}
}
}