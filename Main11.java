
import java.io.*;
import java.util.*;
public class Main11
{
  public static void main(String args[])throws IOException
   {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
    
    System.out.println("Enter the year:");
    int year=Integer.parseInt(br.readLine());
    if(year%4==0 || year%100!=0)
    {
      System.out.println("leap year");
    }
    else if(year%400==0)
    {
      System.out.println("leap year");
    }
    else
    {
      System.out.println("Not leap year");
    }
  }
}
