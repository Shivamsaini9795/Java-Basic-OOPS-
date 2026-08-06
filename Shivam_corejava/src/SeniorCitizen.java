import java.util.*;
public class SeniorCitizen {
	public static void main(String[] args) {
		System.out.println("Enter the age ");
		Scanner obj=new Scanner(System.in);
		int age=obj.nextInt();
		if(age>=60)
		{
			System.out.println("You are Senior citizen");
		}
		else
		{
			System.out.println("You are not Senior citizen");
		}
	}

}
