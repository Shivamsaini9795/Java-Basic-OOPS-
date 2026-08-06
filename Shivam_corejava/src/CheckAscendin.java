import java.util.*;
public class CheckAscendin {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,2,3,4));
		int count=0;
		for(int i=0;i<a.size();i++)
		{
			for(int j=i+1;j<a.size();j++)
			{
				if(a.get(i)>a.get(j))
				{
					count=count+1;
					
				}

			}
		}
		if (count==0)
		{
			System.out.println("This list is sorted  in ascending");
		}
		else
		{
			System.out.println("This list is not sorted  in ascending");
		}

	}

}
