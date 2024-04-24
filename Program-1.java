public class p1 {
    public static void main(String[] args) 
    {

      System.out.println("My Name Is Krinshsmith Kava");
      System.out.println("Er_no :: 220130318102");
        ChildClass obj = new ChildClass();
        obj.display();
    }
}

class ParentClass 
{
    int num = 100;
}

class ChildClass extends ParentClass
{
     int num = 50;

    void display() 
    {
        System.out.println("Child class num: " + num);
        System.out.println("Parent class num: " + super.num);
    }
}
