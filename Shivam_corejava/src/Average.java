
import java.util.*;
public class Average { 
public static void main(String[] args)
{
	System.out.println("Enter the 3 numbers ");
	int a,b,c,avg;
	Scanner obj=new Scanner(System.in);
	a=obj.nextInt();
	b=obj.nextInt();
	c=obj.nextInt();
	avg=(a+b+c)/3;
	System.out.println("Average of thre number is the "+avg);
	obj.close();
}
	

}
