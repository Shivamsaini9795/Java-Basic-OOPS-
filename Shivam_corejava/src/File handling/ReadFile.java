import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class ReadFile {
    public static void main(String[] args) {
        try{
            File file=new File("example.txt");
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine())
            {
                String data=sc.nextLine(); 
                System.out.println(data);
            }
        }
            catch(FileNotFoundException e) {

            
                System.out.println("An error  occured");
                e.printStackTrace();
            }
            
        }
    }
    

