public class RecursionSumOfdigits
{
	public static void main (String[]args)
	{
		int a=8565;
		System.out.println("Sum of digits: "+sum(a));
	}
	static int sum(int a)
	{
		if(a==0)
			return 0;
		return(a%10)+sum(a/10);
	}
}




