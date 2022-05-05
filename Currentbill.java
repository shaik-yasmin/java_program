import java.util.Scanner;
class Currentbill
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int cno,pmr,lmr,tu;
String cname;
float cbill;

System.out.println("Enter Custoner Number:");
cno=sc.nextInt();
System.out.println("Enter Customer Name:");
cname=sc.next();
System.out.println("Enter Present Month Reading:");
pmr=sc.nextInt();
System.out.println("Enter Last Month Reading:");
lmr=sc.nextInt();
System.out.println("current bill:");
cbill=sc.nextFloat();
 tu=pmr-lmr;

 if(tu<=50)
cbill=tu*1.45f;
else if(tu<=100)
cbill=((50*1.45f)+((tu-50)*2.30f));
else if(tu<=200)
cbill=((50*1.45f)+50*3.20f+(tu-100)*3.56f);
else if(tu<=300)
cbill=((50*1.45f)+50*3.20f+100*3.56f+tu-200*4.87f);
else if(tu<=400)
cbill=((50*1.45f)+50*3.20f+200*3.56f+tu-300*5.76f);
else if(tu<=500)
cbill=((50*1.45f)+50*3.20f+200*3.56f+tu-400*6.47f);

else

System.out.println("CURRENT BILL");
System.out.println("The Customer Number:"+cno);
System.out.println("The Customer Name:"+cname);
System.out.println("The Customer Present Month Reading:"+pmr);
System.out.println("The Customer Last Month Reading:"+lmr);
System.out.println("The Total Units:"+tu);
System.out.println("The Current Bill:"+cbill);
}
}