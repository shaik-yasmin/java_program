import java.util.Scanner;
class Evenodd
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a;
      System.out.println("enter a value:");
      a= sc.nextInt();
      switch(a%2)
      {
        case 0:
        System.out.println("a is even");
          break;
        case 1:
        System.out.println("a is odd");
          break;
          default:
      }
    }
  }