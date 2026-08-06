public class FunOverriding {
	void sound()
	{
		System.out.println("Animal makes a Sound");
	}
}
class Dog extends FunOverriding
	{
		@Override
		void sound()
		{
			System.out.println("Dog barks");
		}
}
    

class Main
{
   public static void main(String[] args) 
{
	FunOverriding obj=new Dog();
	obj.sound();

} 
}

