import java.util.Scanner;
public class Grademarks {

	public static void main(String[] args) {
		System.out.println("Enter the student marks percentage");
		Scanner obj=new Scanner(System.in);
		float marks=obj.nextFloat();
       if(marks>80)
       {
    	   System.out.println("A+ Grade");
       }
       else if((marks>60)&&(marks<=80))
       {
    	   System.out.println("A Grade");
       }
       else if((marks>50)&&(marks<=60))
       {
    	   System.out.println("B+ Grade");
       }
       else if((marks>45)&&(marks<=50))
       {
    	   System.out.println("B Grade");
       }
       else if((marks>25)&&(marks<=45))
       {
    	   System.out.println("C Grade");
       }
       else if(marks<=25)
       {
    	   System.out.println(" D Grade");
       }
	}

}
