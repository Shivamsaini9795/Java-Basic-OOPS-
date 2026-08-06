import java.util.*;
public class FirstArray {

	public static void main(String[] args) {
		int[] numbers = new int[10];
System.out.println("Enter the 10 number ");
Scanner obj=new Scanner(System.in);
  for(int i=0;i<10;i++)
  {
	  numbers[i]=obj.nextInt();
  }
  System.out.println("10 number is the ");
  for(int i=0;i<10;i++)
  {
	  System.out.println(numbers[i]);
  }
  obj.close();

	}

}
