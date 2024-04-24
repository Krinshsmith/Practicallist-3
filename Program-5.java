class A 
{
    void methodA() 
    {
        System.out.println("This is class A method.");
    }
}

class B extends A 
{
    void methodB() 
    {
        System.out.println("This is class B method.");
    }
}

class C extends B 
{
    void methodC()
    {
        System.out.println("This is class C method.");
    }
}

public class p5 
{
    public static void main(String[] args) 
   {
        System.out.println("My Name Is Krinshsmith Kava");
        System.out.println("Er_no :: 220130318102");
        C cObj = new C();
        cObj.methodA();
        cObj.methodB();
        cObj.methodC();
    }
}
