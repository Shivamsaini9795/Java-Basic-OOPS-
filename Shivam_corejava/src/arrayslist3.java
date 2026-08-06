import java.util.ArrayList;
import java.util.Arrays;
public class arrayslist3 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,2,3));
		ArrayList<Integer> b=new ArrayList<>(Arrays.asList(4,5,6,7,8));
		ArrayList<Integer> c=new ArrayList<>(Arrays.asList());
		
		int i=0;int j=0;
		while (i < a.size() || j < b.size()) 
        {
            if (i < a.size()) 
            {
                c.add(a.get(i));
                i++;
            }
            if (j < b.size()) 
            {
                c.add(b.get(j));
                j++;
            }
        }
		

	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	}
}