class Main{
    public static void main(String[] args)
    {
        example obj=new more();
        obj.sum(3,7);
        obj.massege();
    }
}
abstract class example
{
    abstract void massege();
    void sum(int x,int y)
    {
        System.out.println(x+y);
    }
}

class more extends example
{
    void massege()
    {
        System.out.println("Hi");
    }
}
