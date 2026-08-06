import java.util.*;
public class City {
	public static void main(String[] args) {
		System.out.println("Enter the city name ");
		Scanner obj=new Scanner (System.in);
		String cityname=obj.nextLine();
		if(cityname.equals("Delhi"))
		{
			System.out.println("Redfort");
		}
		else if(cityname.equals("Agra"))
		{
			System.out.println("Taj Mahal");
		}
		else if(cityname.equals("Jaipur"))
		{
			System.out.println("Jal Mahal");
		}
		else
		{
			System.out.println("Enter correct name of city ");
		}

	}

}
