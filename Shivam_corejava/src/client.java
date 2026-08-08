
import java.util.*;
interface client
{
  public  void input();
    void display();
}

class shivam implements client
{
    String name;
    double salary;
     Scanner obj=new Scanner(System.in);
      public void input()
     {
         System.out.println("Enter the user name ");
         name=obj.nextLine();
         System.out.println("Enter the Salary ");
         salary=obj.nextDouble();
     }
     public void display()
     {
      System.out.println("Username :" +name)   ;
      System.out.println("Salary :" +salary);
     }
     public static void main(String[]args)
     {
         client obj=new shivam();
         obj.input();
         obj.display();
     }
    }
    