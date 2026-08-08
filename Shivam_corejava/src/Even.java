import java.util.Scanner;
public class Even
{
  public static void main(String[] args) 
  {
      int number;
      System.out.println("Enter the number ");
      Scanner obj=new Scanner(System.in);
      number =obj.nextInt();
      if(number%2==0)
      {
        System.out.println(+number+" Number is Even");
      }    
      else
      {
        System.out.println(+number+" Number is Odd");
      }
  }
}