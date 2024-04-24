interface Shape 
{
    double getArea();

    double getPerimeter();
}

class Circle implements Shape
  {
    private double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    public double getArea() 
    {
        return Math.PI * radius * radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
}

public class p18 
{
    public static void main(String[] args)
   {
        System.out.println("My Name Is Krinshsmith Kava");
        System.out.println("Er_no :: 220130318102");
        Circle circle = new Circle(5);
        System.out.println("Area of the circle: " + circle.getArea());
        System.out.println("Perimeter of the circle: " + circle.getPerimeter());
    }
}
