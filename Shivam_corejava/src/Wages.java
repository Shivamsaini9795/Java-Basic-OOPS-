import java.util.*;
public class Wages {
	public static void main(String[] args) {
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter the age ");
		int age=obj.nextInt();
		System.out.println("Enter the sex ");
		String sex=obj.next();
		System.out.println("Enter the number of the day ");
		int days=obj.nextInt();
		if((age>=18)&&(age<30))
		{
			if(sex.equals("M"))
			{
				int wages=700*days;
				System.out.println("Wages is the "+wages);
			}
			else if(sex.equals("F"))
			{
				int wages=750*days;
				System.out.println("Wages is the "+wages);
			}
			else
			{
				System.out.println("Invalid choice ");
			}
		}
		else if((age>=30)&&(age<=40))
		{
			if(sex.equals("M"))
			{
				int wages=800*days;
				System.out.println("Wages is the "+wages);
			}
			else if(sex.equals("F"))
			{
				int wages=850*days;
				System.out.println("Wages is the "+wages);
			}
			else
			{
				System.out.println("Invalid choice ");
			}
		}
		else
		{
			System.out.println("Invalid Age ");
		}

	}

}
