 
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args)
    { 
        String str;
        char ch;
        int count=0;
        System.out.println("Enter the string ");
        Scanner obj=new Scanner(System.in);
         str=obj.nextLine();
        System.out.println("Enter the string to find character");
        ch=obj.next().charAt(0);
        for(int i=0;i<str.length();i++)
        {
            if(ch==str.charAt(i))
            {
            count++;
            }
        }
        System.out.println("character found "+count);
    }
    
}
