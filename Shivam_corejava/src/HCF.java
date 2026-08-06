import java.util.*;
public class HCF {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the two number :");
		Scanner obj=new Scanner(System.in);
		int a= obj.nextInt();
		int b=obj.nextInt();
		int hcf=0;
		if(a<b) {
			for(int i=1;i<=a;i++)
			{
				if((a%i==0)&(b%i==0))
				{
					hcf=i;
				}
			}
		}
		else
		{
			for(int i=1;i<=b;i++)
			{
				if((a%i==0)&(b%i==0))
				{
					hcf=i;
				}
			}
		}
		System.out.println(hcf);
		

	}

}
