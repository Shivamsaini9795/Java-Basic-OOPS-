import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int n;
        int fact=1;
        System.out.println("Enter the number ");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.printf("Factorial of %d is %d",n,fact);
    }
    
}
