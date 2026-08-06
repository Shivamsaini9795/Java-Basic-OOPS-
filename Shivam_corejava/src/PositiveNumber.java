import java.util.*;
public class PositiveNumber {

	public static void main(String[] args) {
		System.out.println("Enter the any number ");
       Scanner obj=new Scanner (System.in);
       int num=obj.nextInt();
       if(num>0)
       {
    	   System.out.println("Positive Number ");
       }
       else 
       {
    	   System.out.println("Negative Number");
       }
       
}
}
