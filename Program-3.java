interface Demo
{
    void display();
}

class Test implements Demo
{
    public void display() 
    {
        System.out.println("Hello Welcome TO Earth ...");
    }
}

public class p3 
{
    public static void main(String[] args) 
    {

        System.out.println("My Name Is Krinshsmith Kava");
        System.out.println("Er_no :: 220130318102");
        Test t1 = new Test();
         t1.display();
    }
}
