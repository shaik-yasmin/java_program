import java.util.Scanner;
class First
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner (System.in);
      int a,b,c,d,e,f;
      System.out.println("enter a value");
      a=sc.nextInt();
      System.out.println("enter b value");
      b=sc.nextInt();
      c=a+b;
      d=a-b;
      e=a*b;
      f=a/b;
      System.out.println("add:"+c);
      System.out.println("sub:"+d);
      System.out.println("mul:"+e); 
      System.out.println("div:"+f);
    }
  }