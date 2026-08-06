import java.util.*;
public class Factorials {
	public static void main(String[] args) {
  System.out.println("Enter the number ");
  Scanner obj=new Scanner(System.in);
   int num=obj.nextInt();
    int fact=1;
     for(int i=1;i<=num;i++)
     {
    	 fact=fact*i;
     }
     System.out.println("Factorial of "+num+" is "+fact);
	}

}
