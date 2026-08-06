import java.util.ArrayList;
import java.util.Arrays;
public class AllEvenInList {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,13,20,41,5));
		int count=0;
		for(int i=0;i<a.size();i++)
		{
			if (a.get(i)%2==0) {
				count=count+1;
			}
			
		}
		if(count==0) {
			System.out.println("this list contain only odd number ");
		}
		else
		{
			System.out.println("this list contain even number also ");
		}
	}

}
