import java.math.BigInteger;
import java.util.Scanner;

public class MethodsExercises
{
//        public static int add(int x,int y)
//    {
//        return x + y;
//    }
//    public static int sub(int x,int y)
//    {
//        return x - y;
//    }
////    // what is going on??????
//    static int answer = 0;
//    public static int multiply(int x, int y)
//    {
//        answer += x;
//        if(y == 1)
//        {
//            return answer;
//        }
//        System.out.println("x = " + x);
//        System.out.println("answer = " + answer);
//        System.out.println("multiplyer = " + y);
//        return multiply(x, y-1);
//        return x + multiply(x, y-1);
//    }
    //        if(y == 1)
//        {
//            return x;
//        }
////        System.out.println(x + multiply(x,y-1));
//        System.out.println("x = " + x);
//        System.out.println("multiply(x,y-1) = " + multiply(x, y - 1));

//
//    public static double divide(double x,double y)
//    {
//        return x / y;
//    }
//    public static boolean modulo(double x,double m)
//    {
//        return x % m == 0;
//    }

//    public static void getInteger(int x, int y)
//    {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.printf("Enter number from : %s and %s %n", x,y);
//        int userInput = scanner.nextInt(); // input as int
//        if(userInput >= x & userInput <= y)
//        {
//            System.out.println("You entered: " + userInput + " you're not that dumb thank you");
//        }
//        else{
//            System.out.println("cant you read?");
//            getInteger(x,y);
//        }
//    }
    public static void calcFactorial()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number from 1 - 10: ");
        int userInput = scanner.nextInt(); // input as int
        long fact=1; // what is this declaration????????/
        for(int i=1;i<=userInput;i++){
            fact=fact*i;
            System.out.println("fact = " + fact);
            System.out.println("i = " + i);
        }
        System.out.println(userInput+"! = "+fact);
    }

    public static void main(String[] args)
    {
        calcFactorial();
//        getInteger(1,10);
//        System.out.println(add(2,3));
//        System.out.println(sub(2,3));
//        System.out.println(multiply(11, 6));
//        System.out.println(divide(2,3));
//        System.out.println(modulo(48,3));
    }
}
