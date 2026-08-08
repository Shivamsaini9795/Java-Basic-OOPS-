import java.util.Scanner;
class Add
{
    public static void main(String[]args)
    {
        int x,y,sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number ");
        x=obj.nextInt();
        System.out.println("Enter the second number ");
        y=obj.nextInt();
        sum=x+y;
        System.out.println("Addition is two number is the "+sum);
    }
}