//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.*;
public class CommonIn2List {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		ArrayList<Integer> b=new ArrayList<>(Arrays.asList(6,7,8,5,3));
		for(int i=0;i<a.size();i++)
		{
			for(int j=0;j<b.size();j++)
			{
				if(a.get(i)==b.get(j))
				{
					System.out.println("Commaon element is "+a.get(i));
				}
			}
		}
//			System.out.println("Number of Common String:"+count++);
	}

}
