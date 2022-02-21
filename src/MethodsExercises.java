public class MethodsExercises
{
    public static int add(int x,int y)
    {
        return x + y;
    }
    public static int sub(int x,int y)
    {
        return x - y;
    }
    public static int multiply(int x,int y)
    {
        int n;
        for(int i = 0; i <= y; i++)
        {
            n = x + x;

        }
        return n;
    }
    public static double divide(double x,double y)
    {
        return x / y;
    }
    public static boolean modulo(double x,double m)
    {
        return x % m == 0;
    }

    public static void main(String[] args)
    {
        System.out.println(add(2,3));
        System.out.println(sub(2,3));
        System.out.println(multiply(2,3));
        System.out.println(divide(2,3));
        System.out.println(modulo(48,3));
    }
}
