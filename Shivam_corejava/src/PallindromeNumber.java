import java.util.*;
public class PallindromeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner obj=new Scanner (System.in);
		int n=obj.nextInt();
		int rev=0,rem=0;
		int a=n;
	while(n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(rev==a)
	{
		System.out.println("Pallindrome Number");
	}
	else
	{
		System.out.println("Not Pallindrome Number");
	}

}
}

