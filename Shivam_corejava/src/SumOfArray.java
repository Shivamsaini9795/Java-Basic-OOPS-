import java.util.*;
public class SumOfArray {

	public static void main(String[] args) {
		System.out.println("Enter the number in Array");
		Scanner obj=new Scanner (System.in);
		int sum=0;
		int[] x=new int[10];
		for(int i=0;i<10;i++)
		{
			x[i]=obj.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			sum=sum+x[i];
		}
		System.out.println("Sum of 10 number: "+sum);
      float avg=sum/10;
      System.out.println("Average of 10 number: "+avg);
	}

}
