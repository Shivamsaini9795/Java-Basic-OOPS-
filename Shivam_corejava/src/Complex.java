
import java .util.Scanner;
class Complex
{
    
    public static void main(String[] args)
    {
        int real,img;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the real and img value ");
        real=obj.nextInt();
        img=obj.nextInt();
        System.out.println(real + "+" + img +"i");
        obj.close();
    }
}