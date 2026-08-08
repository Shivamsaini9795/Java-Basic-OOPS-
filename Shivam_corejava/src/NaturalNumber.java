import java.util.Scanner;
class Natural
{
  public static void main(String[] args)
  {
    int []x=new int[10];
    Scanner s=new Scanner(System.in);
    int i;
    System.out.println("Enter the number ");
    for(i=0;i<10;i++)
    {
        x[i]=s.nextInt();
    }
    System.out.println("****Display the output****");
    for(i=0;i<10;i++)
    {
        System.out.println(x[i]);
    }
      
  }
}