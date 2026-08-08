class Main{
    public static void main(String [] args){
        employee obj=new employee(2, 3);
        System.out.println(obj.x);
    }
}
class Person
{
int x;
Person(int y)
{
System.out.println("Person");
x=y;
}
}
class employee extends Person
{
    int z;
    employee(int a1, int a2)
    {
        super(a1);
        z=a2;
    }
}
