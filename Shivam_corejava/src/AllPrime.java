import java.util.*;
public class AllPrime {

	public static void main(String[] args) {
		System.out.println("Enter the first number ");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		System.out.println("Enter the second number ");
		int m=obj.nextInt();
		System.out.println("All prime number between "+n+" to "+m+" : ");
		printprime(n,m);
	}
		public static void printprime(int n,int m)
		{
			
		for(int i=n;i<m;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			   if(count==2)
			    {
				  System.out.println(i);
			    }
		}
		}
}
	
		
