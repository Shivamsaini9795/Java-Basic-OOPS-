import java.util.Scanner;
public class Electricbill {
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
       System.out.println("Enter the number of unit ");
       float bill;
       float unit=obj.nextFloat();
       if(unit<=100)
       {
    	   System.out.println("No charges ");
       }
       else if((unit>100)&&(unit<200))
       {
    	  float b= unit-100;
    	   bill=b*5;
    	   System.out.println("5 per unit charges "+bill);
       }
       else if(unit>=200)
       {
    	   float c=unit-200;
    	   bill=500+(c*10);
    	   System.out.println("10 per unit charges "+bill);
       }
	}

}
