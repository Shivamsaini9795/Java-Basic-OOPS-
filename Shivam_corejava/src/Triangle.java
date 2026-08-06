import java.util.*;
public class Triangle {
	public static void main(String[] args) {
     System.out.println("Enter the three sides of triangle ");
     Scanner obj=new Scanner (System.in);
     int s1=obj.nextInt();
     int s2=obj.nextInt();
     int s3=obj.nextInt();
     if((s1+s2>s3)&&(s1+s3>s2)&&(s2+s3>s1))
     {
    	 System.out.println("Triangle is possible ");
     }
//     else if
//     {
//    	 System.out.println("Triangle is possible ");
//     }
     else
     {
    	 System.out.println("Triangle is not possible ");
     }
	}

}
