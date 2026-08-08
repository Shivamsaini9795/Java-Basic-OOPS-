import java.util.Scanner;
class Search{
    public static void main(String[]args)
    {
        String str;
        String fruit[]={"Apple","Banana","Kiwi"};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the  word");
        str=s.nextLine();
        int count=0;
        for(int i=0;i<3;i++)
        { 
                if(str.equals(fruit[i]))
                {
                    count++;
                System.out.println(str+" Found in Array");
                }
        }
         if(count==0)
         {
            System.out.println(str+" Not found in Array");
                
         }
    }
}
