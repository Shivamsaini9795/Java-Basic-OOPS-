
public class SumofOdd {
public static void main(String[]args)
{
	int n=12;
	int m=37;
	//int sum=0;
	System.out.println("All Even number : ");
	evenNumber(n,m);
	System.out.println("All Odd  number ");
	Oddnumber(n,m);
	
	
}
public static void evenNumber(int n,int m)
{ 
	int i;
	int sum=0;
	for(i=n;i<=m;i++)
	{
		
		if(i%2==0)
		{
			System.out.println(i);
			sum=sum+i;
			
		}
		
	}
	System.out.println("Sum Of Even Number "+sum);
	  
	 
}
public static void Oddnumber(int n,int m)
{
	int sum=0;
	for(int i=n;i<=m;i++)
	{
	  if(i%2>0)
	{
		  
		System.out.println(i);
		sum=sum+i;
	}
}
	System.out.println("Sum Of Odd Number "+sum);
	
}
}
