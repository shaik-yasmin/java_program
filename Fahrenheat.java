import java.util.Scanner;
class Fahrenheat
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int f;
      float c;
      System.out.println("enter fahrenheat value:");
      f=sc.nextInt();
      c=(32-f)*0.55f;
      System.out.println("the celcius value is:"+c);
    }
  }