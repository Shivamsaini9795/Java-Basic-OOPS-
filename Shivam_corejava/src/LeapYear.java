import java.util.*;
public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter the year ");
		Scanner obj=new Scanner(System.in);
		int year=obj.nextInt();
		 if(year%100==0)
		{
			System.out.println(year+" Is a leap year");
		}
		 else if(year%4==0)
		{
			System.out.println(year+" Is a leap year");
		}
		
		else
		{
			System.out.println(year+" Is a not leap year");
		}
	}

}
