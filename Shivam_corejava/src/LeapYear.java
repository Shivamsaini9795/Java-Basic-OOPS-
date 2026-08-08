import java.util.Scanner;
class Year
{
   public static void main(String[] args)
   {
    int year;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the year: ");
    Year y=new Year();
    year=s.nextInt();
    if(year%4==0)
    {
      System.out.println("Leap year");
    }
    else if(year%100==0)
    {
        System.out.println("Leap year");
    }
    else
    {
        System.out.println("Not Leap year");
    }

  }
}