import java.util.*;
public class temp {
	public static void main(String[] args) {
	System.out.println("Enter the water temp");
	Scanner obj=new Scanner(System.in);
	int temp=obj.nextInt();
	if(temp>=100)
	{
		System.out.println("Water is boiling ");
	}
	else
	{
		System.out.println("Water is not boiling ");
	}

	}

}
