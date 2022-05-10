import java.util.Scanner;
class perfect
  {
    public static void main(String args[])
    {
      int n,i,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      n=sc.nextInt();
      i=1;
      while(i<n)
        {
          if(n%i==0)
            sum=sum+i;
          i=i+1;
        }
      if(n==sum)
        System.out.print("It is a perfect number");
      else
        System.out.print("It is not a perfect number");

    }
  }