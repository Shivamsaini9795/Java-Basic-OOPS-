import java.util.*;
public class Employee {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the time period of service ");
		int times=obj.nextInt();
		System.out.println("Enter the your Salary");
		float salary=obj.nextFloat();
		double bonus=0.0;
		if(times>10)
		{
			bonus=(salary*10)/100;
			//System.out.println("Emloyee Salary is "+salary+" and bonus is "+bonus);
		}
		else if((times>=6)&&(times<=10))
		{
			bonus=(salary*8)/100;
			
				//System.out.println("Emloyee Salary is "+salary+" and bonus is "+bonus);
			
		}
		else if(times<6)
		{
			bonus=(salary*5)/100;
			
				//System.out.println("Emloyee Salary is "+salary+" and bonus is "+bonus);
			
		}
		System.out.println("Emloyee Salary is "+salary+" and bonus is "+bonus);
		System.out.println("Total Salary is "+ (salary+bonus));
	}

}
