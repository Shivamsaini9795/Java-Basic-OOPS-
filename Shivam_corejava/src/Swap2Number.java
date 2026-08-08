import java.util.Scanner;
public class Swap2Number {
    public static void main(String[] args) 
    {
        int a;int b;
        System.out.println("Enter the two number");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swaping number is the a="+a+"    and b="+b);
    }
    
}
