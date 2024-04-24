class ParentClass 
{
    public void display() 
    {
        System.out.println("This is the parent class.");
    }
}

class ChildClass extends ParentClass
{
    public void display() 
    {
        System.out.println("This is the child class.");
    }
}

public class p4 
{
    public static void main(String[] args) 
   {

        System.out.println("My Name Is Krinshsmith Kava");
        System.out.println("Er_no :: 220130318102");
        ParentClass parentObj = new ParentClass();
        ChildClass childObj = new ChildClass();

        parentObj.display();
        childObj.display();
    }
}
