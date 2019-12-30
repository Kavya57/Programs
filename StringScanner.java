import java.util.Scanner;
class StringScanner
{
 public static void main(String[] args)
 {
  Scanner scn=new Scanner(System.in);
  System.out.println("Enter a number:");
  int n=scn.nextInt();
  scn.nextLine();
  System.out.println("Enter a word:");
  String word=scn.nextLine();
  System.out.println("You have entered "+n+" and "+word);
 }
}
  