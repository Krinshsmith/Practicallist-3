import package1.p6_Parent;
import package2.p6_Child;

public class p6 
{
    public static void main(String[] args) 
   {
        System.out.println("My Name Is Krinshsmith Kava");
        System.out.println("Er_no :: 220130318102");
        p6_Parent parentObj = new p6_Parent();
        p6_Child childObj = new p6_Child();

        parentObj.display();
        childObj.display();
    }
}
