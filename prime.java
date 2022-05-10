import java.util.Scanner;
class prime
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,c=0,i=1;
      System.out.println("enter n value:");
      n=sc.nextInt();
      while(i<=n)
        {
          if(n%i==0)
          {
            c++;
          }
          i++;
        }
      if(c==2)
        System.out.println("\n given num is prime num");
      else
        System.out.println("\n given num is not prime");
    }
  }