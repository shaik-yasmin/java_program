import java.util.Scanner;
class strong
  {
    public static void main(String args[])
    {
      int org,temp,fact,sum=0,rem;
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter the number:");
      org=sc.nextInt();
      temp=org;
      while(org>0)
        {
          rem=org%10;
          fact=1;
          while(rem>0)
            {
              fact=fact*rem;
              rem=rem-1;
              }
          sum=sum+fact;
          org=org/10;          
        }
      if(temp==sum)
        System.out.println("It is Strong number");
      else
        System.out.println("It is not a Strong number");
      }
  }