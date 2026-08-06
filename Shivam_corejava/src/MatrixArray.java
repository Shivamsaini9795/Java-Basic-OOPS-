import java.util.*;
public class MatrixArray {

	public static void main(String[] args) {
		System.out.println("Enter the number in the Array ");
		Scanner obj=new Scanner(System.in);
		int arr[][]=new int[4][4];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][j]=obj.nextInt();
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("  ");
		}
		obj.close();

	}

}
