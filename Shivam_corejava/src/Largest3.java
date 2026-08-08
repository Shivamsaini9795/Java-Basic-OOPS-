import java.util.Scanner;
public class Largest3 {
    public static void main(String[] args)
    {
        int a ,b,c;
        System.out.println("Enter the 3 number ");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        if((a>b)&&(a>c))
        {
            System.out.println(+a+" is largest Number");
        }
        else if((b>a)&&(b>c))
        {
            System.out.println(+b+" is largest Number");
        }
        else
        {
            System.out.println(+c+" is largest Number ");
        }
    }
}
