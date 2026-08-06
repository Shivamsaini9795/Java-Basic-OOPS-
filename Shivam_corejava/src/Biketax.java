import java.util.Scanner;
public class Biketax {
public static void main(String[] args) {
System.out.println("Enter the cost price of the bike");
Scanner obj=new Scanner(System.in);
float price=obj.nextFloat();
double tax=0.0;
if(price<=50000)
 {
	 tax=(price*5)/100;
	System.out.println("Bike price is the "+price+" And tax is the "+tax );
}
else if((price>50000)&&(price<=100000)) 
{
	 tax=(price*10)/100;
	System.out.println("Bike price is the "+price+" And tax is the "+tax);
}
else
{
	  tax=(price*15)/100;
	System.out.println("Bike price is the "+price+" And tax is the " +tax);
}

}

}

