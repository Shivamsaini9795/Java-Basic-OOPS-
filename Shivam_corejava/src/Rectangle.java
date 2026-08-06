import java.util.*;
public class Rectangle {

	public static void main(String[] args) {
		System.out.println("Enter the length and width of rectangle ");
		Scanner obj=new Scanner(System.in);
		float l=obj.nextFloat();
		float w=obj.nextFloat();
		float A=l*w;
		float P= 2*(l+w);
		System.out.println("Area of rectangle is the "+A+" And Perimeter is the "+P);
		
obj.close();		

	}

}
