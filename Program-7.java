interface A 
{
    void methodA();
}

interface B 
{
    void methodB();
}

class MyClass implements A, B 
{
    public void methodA() 
    {
        System.out.println("Method A");
    }

    public void methodB() 
    {
        System.out.println("Method B");
    }
}

public class p7 
{
    public static void main(String[] args)
   {
       System.out.println("My Name Is Krinshsmith Kava");
       System.out.println("Er_no :: 220130318102");
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
}