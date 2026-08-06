import java.util.*;
public class DecimalToBinary {
	public static String reverseString(String str)
	{
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		return sb.toString();
				
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the number ");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int rem=0;
		String bin="";
		while(n!=0)
		{
			rem=n%2;
			bin=bin+String.valueOf(rem);
			n=n/2;
		}
		String binary=reverseString(bin.toString());
		System.out.println(binary);
		obj.close();
		
	}

}
