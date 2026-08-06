import java.util.*;
public class VowelInString {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner obj=new Scanner(System.in);
		String str=obj.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char c= Character.toLowerCase(str.charAt(i));
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
			}
		}
		System.out.println("Number of vowels in the string : " +count);
	}

}
