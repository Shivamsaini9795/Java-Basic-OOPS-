import java.util.Scanner;
public class CheckPositive {
    public static void main(String[] args) {
        float n;
        System.out.println("Enter the number ");
        Scanner obj=new Scanner(System.in);
        n=obj.nextFloat();
        if(n>0)
        {
            System.out.println("Positive Number");
        }
        else if(n<0)
        {
            System.out.println("Negative Number ");
        }
    }
    
}
