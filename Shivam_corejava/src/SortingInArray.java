import java.util.*;
public class SortingInArray {

	public static void main(String[] args) 
	{
		int arr[]= {2,3,1,4,9,6,6,10,8};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
	}

}
