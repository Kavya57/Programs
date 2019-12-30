import java.util.StringTokenizer;
class StringTokenization
{
 public static void main(String[] args)
 {
   String s="Something to be, Written and show, to everyone";
   String[] s1=s.split(",");
   for(int i=0;i<s1.length;i++)
    System.out.println(s1[i]);
   StringTokenizer st=new StringTokenizer(s,",");
   System.out.println(st.countTokens());
   while(st.hasMoreTokens())
    System.out.println(st.nextToken());
 }
}
	