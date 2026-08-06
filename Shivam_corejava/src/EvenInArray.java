import java.util.*;
public class EvenInArray {

	public static void main(String[] args) {
		System.out.println("Enter the number in the Array ");
		Scanner obj=new Scanner(System.in);
		int[] arr=new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=obj.nextInt();
		}
		System.out.println("All Even number in the Array :");
		for(int i=0;i<10;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
			
		}

	}

}
