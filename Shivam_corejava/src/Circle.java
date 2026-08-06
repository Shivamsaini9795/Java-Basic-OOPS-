import java.util.*;
public class Circle {

	public static void main(String[] args) {
		Scanner obj=new Scanner (System.in);
		float r;
		System.out.println("Enter the radius of circle ");
		r=obj.nextFloat();
		float a= 3.14f*r*r;
		float c=2*3.14f*r;
		System.out.println("Area of circle is the "+a);
		System.out.println("Circumference of circle is the "+c);
		obj.close();

	}

}
