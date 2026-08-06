import java.util.ArrayList;
import java.util.Arrays;

public class FirstnumInList {
    public static void main(String[] args) {
    	ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,13,12,20,41,5,12,12));
        int target = 20;
    	int index = 0;
        int i = 0;

        while (i < a.size()) 
        {
            if (a.get(i)== target) 
            {
                index = i;
                break;
            }
            i++;
           
        }

        System.out.println("First occurrence of " + target + " is at index " + index);
    }
}

