import java.util.*;
public class FibonacciSeries {
	
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int i=0;
		int a=0,b=1;
		int sum=0;
		while(i<n)
		{
			sum=a+b;
			System.out.print(sum);
			a=b;
			b=sum;
			i++;
		}
       
	}
	 
}
