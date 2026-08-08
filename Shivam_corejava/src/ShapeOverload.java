public class ShapeOverload {
    void area(int l,int b)
    {
        int a=l*b;
        System.out.println("Area of rectangle is "+a);
    }
    void area(float x)
    {
        float s=x*x;
        System.out.println("Area of Square is "+s);
    }
    void area(float c,float d)
    {
        float t=(c*d)/2;
        System.out.println("Area of Triangle is "+t);
    }
    void area(int r)
    {
        double area=3.14*r*r;
        System.out.println("Area of circel is "+area);
    }
    public static void main(String[] args) {
        ShapeOverload obj=new ShapeOverload();
        obj.area(4,5);
        obj.area(2.5f);
        obj.area(5.5f,6.5f);
        obj.area(10); 
    }
    
}
