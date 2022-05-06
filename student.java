import java.util.Scanner;
class student
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int sno,sub1,sub2,sub3,tm;
  int avg;
  String sname;
  System.out.println("enter student num:");
  sno=sc.nextInt();
  System.out.println("enter student name:");
  sname=sc.next();
  System.out.println("enter subject1 marks:");
  sub1=sc.nextInt();
  System.out.println("enter subject2 marks:");
  sub2=sc.nextInt();
  System.out.println("enter subject3 marks:");
  sub3=sc.nextInt();
  tm=sub1+sub2+sub3;
  avg=tm/3;
   System.out.println("student details");
   System.out.println("student num is:"+sno);
    System.out.println("student name is:"+sname);
    System.out.println("student marks");
    System.out.println("sub1:"+sub1);
     System.out.println("sub2:"+sub2);
    System.out.println("sub3:"+sub3);
    System.out.println("student total marks is:"+tm);
    System.out.println("student avg marks is:"+avg);
   if(sub1>=35&&sub2>=35&&sub3>=35)
   {
      System.out.println("result pass");
      if(avg<50)
         System.out.println("Grade C");
      else if(avg>=51&&avg<=70)
         System.out.println("Grade B");
      else if(avg>=71&&avg<=80)
         System.out.println("Grade A");
      else
         System.out.println("Distension");
   } 
  else
   {
     System.out.println("Result fail");
   

   }
  }
}
