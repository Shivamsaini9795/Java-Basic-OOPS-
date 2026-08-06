import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number ");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a=n;
        int rem=0;
        int sum=0;
        while(n>0)
        {
        	rem=n%10;
        	int l=rem*rem*rem;
        	sum=sum+l;
        	n=n/10;
        }
        if(sum==a)
        {
        	System.out.println("Armstrong Number ");
        }
        else
        {
        	System.out.println("Not Armstrong Number ");
        }
	}

}
