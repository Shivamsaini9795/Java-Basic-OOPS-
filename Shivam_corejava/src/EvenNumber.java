import java.util.*;
public class EvenNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner obj=new Scanner(System.in);
		int number=obj.nextInt();
		if(number%2==0)
		{
			System.out.println("Even Number ");
		}
		else 
		{
			System.out.println("Odd Number ");
		}

	}

}
