import java.util.Scanner;
import java.lang.System;
class Nsum
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i=1,n,sum=0;
      System.out.println("enter n value:");
      n=sc.nextInt();
      while(i<=n)
        {
          sum=sum+i;
          i++;
        }
      System.out.println("\n the sum of natural num"+sum);
    }
  }