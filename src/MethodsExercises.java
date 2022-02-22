import java.util.Scanner;

public class MethodsExercises
{
    //    public static int add(int x,int y)
//    {
//        return x + y;
//    }
//    public static int sub(int x,int y)
//    {
//        return x - y;
//    }
//    // what is going on??????
    public static int multiply(int x, int y) {
//        int multiplyer = y;
        for (int i = y; i >= 0; i--) {
            x += x;
//            multiply(x, multiplyer);
        }
        return x;
    }
//        do
//        {
////            if (count > 0)
////            {
//            x += x;
//            multiply(x, multiplyer);
//            i--;
////            }
//        }
//        while (i >= 0);
//        return x;

//    }
//    public static double divide(double x,double y)
//    {
//        return x / y;
//    }
//    public static boolean modulo(double x,double m)
//    {
//        return x % m == 0;
//    }

//    public static void getInteger()
//    {
//        Scanner scanner = new Scanner(System.in);
////
//        System.out.print("Enter number from 1 - 10: ");
//        int userInput = scanner.nextInt(); // input as int
//        if(userInput >= 1 & userInput <= 10)
//        {
//            System.out.println("You entered: " + userInput + " your not that dumb thank you");
//        }
//        else{
//            System.out.println("cant you read?");
//            getInteger();
//        }
//    }
//    public static void calcFactorial()
//    {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter number from 1 - 10: ");
//        int userInput = scanner.nextInt(); // input as int
//        int i,fact=1; // what is this declaration????????/
//        for(i=1;i<=userInput;i++){
//            fact=fact*i;
//        }
//        System.out.println(userInput+"! = "+fact);
//    }

    public static void main(String[] args) {
//        calcFactorial();
//        getInteger();
//        System.out.println(add(2,3));
//        System.out.println(sub(2,3));
        System.out.println(multiply(2, 8));
//        System.out.println(divide(2,3));
//        System.out.println(modulo(48,3));
    }
}
