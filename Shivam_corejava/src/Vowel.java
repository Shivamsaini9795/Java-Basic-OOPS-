import java.util.Scanner;
class vowel
{
    public static void main(String[] args)
    {
        char ch;
        Scanner obj=new Scanner (System.in);
         System.out.println("Enter the character ");
         Main e= new Main();
         ch = obj.next().charAt(0);
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
         {
            System.out.println("Character is vowel");
         }
         else
         {
            System.out.println("Character is Consonent");
         }

    }
}