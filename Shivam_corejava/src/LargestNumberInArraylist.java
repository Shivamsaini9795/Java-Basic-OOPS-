
import java.util.*;
public class LargestNumberInArraylist {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,2,3,120,4,10,20));
		
		int max=a.get(0);
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)>max)
			{
				max=a.get(i);
			}
		}
		System.out.println("Largest number in the Arraylist: "+max);
		
	}

}
