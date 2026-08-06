
public class Animals {
    void makeSound()
    {
        System.out.println("Animal make a sound");
    }
}
class Dog extends Animals
{

    @Override
    void makeSound() 
    {
        System.out.println("The dog are barks");
    }
    
}
class Cat extends Animals
{
    @Override
    void makeSound()
    {
        System.out.println("the cat are meow");
    }
}
