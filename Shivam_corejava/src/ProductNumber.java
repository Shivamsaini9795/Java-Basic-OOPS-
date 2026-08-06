import java.util.*;
public class ProductNumber {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=1,sum=0,prod=1;
		while(a!=0)
		{
			System.out.println("Enter any number ");
			a=obj.nextInt();
			if(a%2==0)
			{
				sum=sum+a;
			}
			else
			{
				prod=prod*a;
			}
		}
		System.out.println("The Even sum is "+sum);
		System.out.println("The  Odd product is "+prod);

	}

}
