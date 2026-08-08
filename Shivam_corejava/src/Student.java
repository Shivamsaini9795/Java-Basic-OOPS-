import java.util.Scanner;
class Student
{
  String name;
  int age;
  int roll;
  
  public void input()
  {
    Scanner o=new Scanner(System.in);
    System.out.println("Enter the student details ");
    name=o.nextLine();
    age=o.nextInt();
    roll=o.nextInt();
  }
  void display()
  {
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
    System.out.println("Roll no : " + roll);
  }

}
class Main
{
public static void main(String[]args)
{
  Student a= new Student() ;
  a.input();
  a.display();
}
}