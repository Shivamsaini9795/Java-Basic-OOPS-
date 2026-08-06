import java.util.*;
public class SortingInArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> b=new ArrayList<>(Arrays.asList(5,3,1,10,20,12,5));
		int temp=0;
		for(int i=0;i<b.size();i++)
		{
			for(int j=i+1;j<b.size();j++)
			{
				if(b.get(i)<b.get(j))
				{
					temp=b.get(i);
					b.set(i, b.get(j));
                    b.set(j, temp);

				}
			}
		}
		for(int k=0;k<b.size();k++)
		{
			System.out.println(b.get(k));
		}
	}

}
