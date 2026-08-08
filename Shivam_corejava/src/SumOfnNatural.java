import java.util.Scanner;
class Number
{
    public static void main(String[] arg)
    {
        int n,sum=0;
        System.out.println("Enter the number ");
        Scanner s= new Scanner(System.in);
        n= s.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}