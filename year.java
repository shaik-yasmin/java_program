import java.util.Scanner;
class year
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int year;
      System.out.println("enter year");
      year =sc.nextInt();
      if (year%4==0)
      {
        System.out.println("it is a leap year");
      }
      else
      {
        System.out.println("not a leap year");
      }
    }
  }