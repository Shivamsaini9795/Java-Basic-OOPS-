import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);

        try {
            System.out.println("Enter the first number: ");
            int num1 = obj.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = obj.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        catch (Exception e) 
        {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } 
        // finally 
        // {
        //     obj.close();
        //     System.out.println("Scanner closed.");
        // }
    }
}


