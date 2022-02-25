package Shapes;

public class Rectangle
{
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(double side)
    {
        this.length=side;
        this.width=side;
}
    public double getArea()
    {
         return this.length * this.width;
    }
    public double getPerimeter()
    {
        return (this.length * 2) + (this.width * 2);
    }

    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle(2,4);

//        System.out.println("getArea() = " + rect1.getArea());
//        System.out.println("rect1.getPerimeter() = " + rect1.getPerimeter());
    }
}
