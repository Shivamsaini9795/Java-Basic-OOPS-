import java.util.*;

public class TenNumbers {
	public static void main(String[] args) {
System.out.println("Enter the 10 number ");

Scanner obj=new Scanner(System.in);

int sum=0;
 for(int i=1;i<=10;i++)
{
	int num=obj.nextInt();
	sum=sum+num;
}
 float avg=sum/10;
 System.out.println("Sum of 10 numbe is "+sum+" Average is the "+avg);
	}

}

