import java.util.*;
public class SmallestNumberInArraylist {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(120,4,10,1,20));
		
		int min=a.get(0);
		for(int i=1;i<a.size();i++)
		{
			if(a.get(i)<min)
			{
				min=a.get(i);
			}
		}
		System.out.println("Smallest number in the Arraylis: "+min);
	}

}
