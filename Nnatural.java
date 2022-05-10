import java.util.Scanner;
class Nnatural
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i=1,n;
      System.out.println("enter n value:");
      n=sc.nextInt();
      while(i<=n)
        {
          System.out.println(" "+i);// \t means double space
          i++;
        }
    }
  }