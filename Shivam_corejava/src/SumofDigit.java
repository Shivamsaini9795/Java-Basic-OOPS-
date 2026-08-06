import java.util.*;
public class SumofDigit {
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner obj=new Scanner (System.in);
		int num=obj.nextInt();
		int sum=0;
		int rem;
        while(num!=0)
        {
        	rem=num%10;
        	sum=sum+num%10;
        	num=num/10;
        }
        System.out.println("The sum of the digits is "+sum);
	}

}
