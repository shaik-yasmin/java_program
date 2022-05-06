import java.util.Scanner;
class seasons
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int choice;
      System.out.println("choice is");
      choice =sc.nextInt();
      switch(choice)
        {
          case 3:
          case 4:
          case 5:
          case 6:
          System.out.println("summer season");
            break;
          case 7:
          case 8:
          case 9:
          case 10:
            System.out.println("rainy season");
            break;
          case 11:
          case 12:
          case 1:
          case 2:
            System.out.println("winter season");
            break;
        }
        
    }
  }