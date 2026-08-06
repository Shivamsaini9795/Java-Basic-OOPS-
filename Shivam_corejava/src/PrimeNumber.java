import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
    System.out.println("Enter the number ");
    Scanner obj=new Scanner(System.in);
    int num=obj.nextInt();
    int count=0;
    for(int i=1;i<=num;i++)
    {
    	if(num%i==0)
    	{
    		count++;
    	}
    }
    if(count==2)
    {
    	System.out.println("Prime number ");
    }
    else
    {
    	System.out.println("Not prime Number ");
    }
	}

}
