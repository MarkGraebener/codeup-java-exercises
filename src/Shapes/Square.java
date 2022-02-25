package Shapes;

public class Square extends Rectangle
{
    public double side;

//    public Square( double side)
//    {
//        super(double length,double width);
//        this.side = side;
//        this.length = side;
//        this.width = side;
//    }

//todo why cant i make a constructor that only takes in one perimeter?????????
    public Square(double length, double width, double side)
    {
        super(length, width);
        this.side = side;
    }
    public Square(double side)
    {
        super(side);
//        this.length = side;
//        this.width = side;
        this.side = side;
    }
    public double getArea()
    {
        return Math.pow(this.side,2);
    }
    public double getPerimeter()
    {
        return this.side * 4;
    }

    public static void main(String[] args)
    {

    }
}
