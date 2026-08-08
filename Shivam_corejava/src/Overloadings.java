class Overloadings
{
    void add(int a,int b)
    {
        int c=a+b;
        System.out.println("Intiger addition is "+c);
    }
    float add(float x,float y)
    {
        float z=x+y;
        System.out.println("Float addition is "+z);
        return z;
    }
    public static void main(String[]args)
    {
        Overloadings obj=new Overloadings();
        obj.add(12,18);
        obj.add(13.5f,8.4f);
    }
}