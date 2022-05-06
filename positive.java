import java.util.Scanner;
import java.lang.System;
class positive
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("enter n value:");
      n=sc.nextInt();
      if(n>=1)
       System.out.println("positive");
      else
         System.out.println("negitive");
    }
  }