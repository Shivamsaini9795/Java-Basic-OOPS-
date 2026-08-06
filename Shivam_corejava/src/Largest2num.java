import java.util.*;
public class Largest2num {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter two number ");
		int num1=obj.nextInt();
		int num2=obj.nextInt();
		if(num1>num2)
		{
			System.out.println(num1+" is the largest");
		}
		else
		{
			System.out.println(num2+" is the largest");
		}
		
	}

}
