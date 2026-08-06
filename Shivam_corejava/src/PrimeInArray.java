public class PrimeInArray
{
	public static void main(String[]args)
	{
		int arr[]= {5,2,3,4,6,11,78,23};
		int count=0;
		System.out.println("All Prime number in the Array : ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=2;j<arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && arr[i]>1)
			{
				System.out.println(arr[i]);
			}
		}
	}
}