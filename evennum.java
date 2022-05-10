import java.util.Scanner;
class evennum
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
   int i,n;
   System.out.println("enter n value:");
   n=sc.nextInt();
   for(i=1;i<=n;i++)
   {
     if(i%2==0)
     {
       System.out.println("upto given num"+i);
       
       }
  }
} 
}