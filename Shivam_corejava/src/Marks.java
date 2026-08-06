import java.util.*;
public class Marks {

	public static void main(String[] args) {
		System.out.println("Enter the 5 subject marks ");
		float s1,s2,s3,s4,s5;
		Scanner obj=new Scanner (System.in);
		s1=obj.nextFloat();
		s2=obj.nextFloat();
		s3=obj.nextFloat();
		s4=obj.nextFloat();
		s5=obj.nextFloat();
		float total=s1+s2+s3+s4+s5;
		float per=total/5;
		System.out.println("Total marks is the "+total+" And Percentage is the "+per+"%");
		obj.close();

	}

}
