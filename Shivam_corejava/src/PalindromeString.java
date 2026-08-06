import java.util.*;
public class PalindromeString {

	public static void main(String[] args) {
		String str="Naman";
		String rev=str.toLowerCase();
		for(int i=0;i<rev.length()/2;)
		{
			if(rev.charAt(i)==rev.charAt(rev.length()-i-1))
					{
						System.out.println(str+" is a palindrome");
					}
			else
			{
				System.out.println(str+" is a not palindrome");
			}
			break;
		}

	}

}
