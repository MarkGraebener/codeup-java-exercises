package Shapes;

public class ShapesTest
{

    public static void main(String[] args)
    {
        Measurable myShape;
        myShape = new Square(3);
//        System.out.println("myShape = " + myShape.length);
        System.out.println("myShape.getArea() = " + myShape.getArea());
    }
}
