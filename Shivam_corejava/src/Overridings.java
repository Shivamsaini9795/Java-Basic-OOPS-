class Overridings {
    void show()
    {
        System.out.println("I am base class ");
    }
}
class Derived extends Overridings
{
    
    void show()
    {
        System.out.println("I amd derived class");
    }
}
class  Main{
public static void main(String[] args) 
{
    Derived obj=new Derived();
    obj.show();
}
    
}