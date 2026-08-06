import java.io.FileWriter;
import  java.io.IOException;


    
public class Writefile
{
    public static void main(String[]args)
    {
        try{
             FileWriter writer=new FileWriter("example.txt");
            writer.write("Hello,this is a file handling example in Java gfg sjfksf  sfjs dffj sdfshiva fjf sisnisf sjfsfje ffijr ");
            writer.close();
            
                System.out.println("Successfully wrote to  the file");
            }
            
        
        catch (IOException e)
        {
            System.out.println("An error ");
            e.printStackTrace();
        }
    }
}


