import java.util.Scanner;
class bigvalue
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a,b,c;
      System.out.println("enter a value:");
      a=sc.nextInt();
       System.out.println("enter b value:");
       b=sc.nextInt();
       System.out.println("enter c value:");
       c=sc.nextInt();
      if(a>b&&a>c)
      {
         System.out.println("the big value is:"+a);
      }
      else if(b>a&&b>c)
      {
        System.out.println("the big value is:"+b);
      }
      else
      {
        System.out.println("the big value is:"+c);
      }
       
      }
  }