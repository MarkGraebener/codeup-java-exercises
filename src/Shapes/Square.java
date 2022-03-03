package Shapes;

public class Square extends Quadrilateral
{
    int side;

    public Square(int length, int width)
    {
        super(length, width);
    }

    protected Square(int side)
    {
        super(side);
        this.length = side;
        this.width = side;
    }

    public static void main(String[] args)
    {

    }
}
