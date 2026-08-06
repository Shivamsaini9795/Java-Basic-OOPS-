import java.util.Arrays;
import java.util.*;
public class AnagramString {

		public static void main(String[] args) {
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter the first String ");
			String str1=obj.next().toLowerCase();
			System.out.println("Enter the Second String ");
			String str2=obj.next().toLowerCase();
	
	       if (str1.length() == str2.length()) 
	       {
	            char[] charArray1 = str1.toCharArray();
	            char[] charArray2 = str2.toCharArray();
	            Arrays.sort(charArray1);
	            Arrays.sort(charArray2);

	            if (Arrays.equals(charArray1, charArray2)) 
	            {
	                System.out.println(str1 + " and " + str2 + " are Anagram");
	            } 
	            else 
	            {
	                System.out.println(str1 + " and " + str2 + " are not Anagram");
	            }
	        } 
	       else 
	        {
	            System.out.println(str1 + " and " + str2 + " are not Anagram");
	        }
	    }
	}
