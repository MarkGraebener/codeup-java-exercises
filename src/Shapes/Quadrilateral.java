package Shapes;

public class Quadrilateral extends Shape implements Measurable
{


    public Quadrilateral(int length, int width)
    {
        this.length = length;
        this.width = width;
    }
    public Quadrilateral(int side)
    {
        this.side = side;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getPerimeter()
    {
        return 0;
    }

    @Override
    public double getArea()
    {
        return this.length * this.width;
    }
}
