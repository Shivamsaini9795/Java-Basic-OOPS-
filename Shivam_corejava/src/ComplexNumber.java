
import java .util.Scanner;
class ComplexNumber
{
    int real,img;
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the real and img value ");
        Complex c=new Complex();
        c.real=s.nextInt();
        c.img=s.nextInt();
        System.out.println( c.real + "+" + c.img +"i");
    }
}