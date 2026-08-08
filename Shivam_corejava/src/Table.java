import java.util.Scanner;
 class Table{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner obj = new Scanner(System.in);
        int n;
        n=obj.nextInt();
        System.out.println("Table is the ");
        for(int i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }
        
    }
}
