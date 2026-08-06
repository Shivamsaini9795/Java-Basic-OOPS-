import java.util.*;
public class SecondLargest {
	public static void main(String[] args) {
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter three number ");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=obj.nextInt();
		if((a>b)&&(a<c))
		{
			System.out.println("!Second largest number is "+a);
		}
		else if((b>a)&&(b<c))
		{
			System.out.println("!!Second largest number is "+b);
		}
		else if ((a>b)&&(a>c))
		{
			System.out.println("!!Second largest number is "+b);
			
		}
		else 
		{
			System.out.println("!!!Second larges number is the "+c);
		}

		}
	}

