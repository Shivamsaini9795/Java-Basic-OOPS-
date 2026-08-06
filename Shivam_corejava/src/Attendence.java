import java.util.*;
public class Attendence {

	public static void main(String[] args) {
		float working_day,absent_day,persent_day;
		float percentage_day;
		System.out.println("Enter the working day ");
		Scanner obj=new Scanner (System.in);
		 working_day=obj.nextInt();

		System.out.println("Enter the absent day");
		absent_day=obj.nextInt();

		persent_day= working_day-absent_day;
		percentage_day= (persent_day/working_day)*100;
		System.out.println("Percent day is the "+percentage_day);
		
		if(percentage_day>=75)
		{
			System.out.println("You are eligible for exam");
		}
		else
		{
			System.out.println("You are not eligible for exam");
		}

	}

}
