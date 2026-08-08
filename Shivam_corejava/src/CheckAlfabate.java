import java.util.Scanner;
public class CheckAlfabate {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter the charactor ");
        Scanner obj=new Scanner(System.in);
        ch=obj.next().charAt(0);
        if((ch>='a'&& ch<='z') || (ch>='A'&& ch<='Z'))
        {
            System.out.println(ch+" is a alphabate");
        }
        else
        {
            System.out.println(ch+"is a not alphabate");
        }



    }
    
}
