abstract class Abstracts {
    abstract void massage();
    void sum(int x,int y)
    {
        System.out.println(x+y);
    }
}
class more extends Abstracts{
    void massage()
    {
        System.err.println("Hi Shivam");
    }
}
class Main{
    public static void main(String[] args) 
    {
        {
            Abstracts obj=new more();
            obj.sum(10, 12);
            obj.massage();
        }
    }
}


