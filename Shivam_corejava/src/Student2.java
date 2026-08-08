class student2
{
    String name;
    int roll;
    int age;
    student2(String n,int r,int a)
    {
        name=n;
        roll=r;
        age=a;
    }
    void display()
    {
        System.out.println(name  +roll  +age);
    }
}
class Main{
    public static void main(String[] args) {
        student obj=new student("Shivam", 14, 22);
        obj.display();
    }
}
