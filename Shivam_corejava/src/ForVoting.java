import java.util.*;
public class ForVoting {

	public static void main(String[] args) {
		System.out.println("Enter the age ");
		Scanner obj=new Scanner(System.in);
		int age=obj.nextInt();
		String str2= "indian";
		String country;
		
		if(age>=18)
		{
			System.out.println("Enter the country : ");
			country=obj.next();
			if(country.equalsIgnoreCase(str2))
			{
				System.out.println("You are afrotable for vote ");
			}
			else
			{
				System.out.println("You are not afrotable for vote ");
				
			}
		}
		else
		{
			
			System.out.println("You are not eligible for the vote ");
		}

	}

}
