import java.util.Scanner;
public class Add {

	public static void main(String[] args) {
		System.out.println("Enter the value a and b");
		Scanner obj=new Scanner(System.in);
		int a,b,c;
		a=obj.nextInt();
		b=obj.nextInt();
		c=a+b;
		System.out.println("Addition of two number is the "+c);
	
obj.close();
	}

}
