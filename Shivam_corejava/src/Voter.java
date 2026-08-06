import java.util.*;
public class Voter {

	public static void main(String[] args) {
     System.out.println("Enter tha age ");
     Scanner obj=new Scanner (System.in);
     int age=obj.nextInt();
     if(age>=18)
     {
    	 System.out.println("Voter is eligible for vote");
     }
     else
     {
    	 System.out.println("Voter is not eligible for vote");
     }
     obj.close();
	}
}