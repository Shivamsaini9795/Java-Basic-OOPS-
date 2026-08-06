package myclass;

public class MethodOverloading {

	void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("Intiger addition is "+sum);		
	}
	void add(float a,float b)
	{
		float sum=a+b;
		System.out.println("Float addition is "+sum);
	}
	void add(int a,float c)
	{
		float add=a+c;
		System.out.println("Intigear and float addition is "+add);
	}
	public static void main(String[] args) 
	{
		MethodOverloading obj=new MethodOverloading();
		obj.add(12,18);
		obj.add(12.3f, 28.5f);
		obj.add(12,13.5f);
	}

}
