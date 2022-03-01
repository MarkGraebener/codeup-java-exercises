package util;

import java.util.Scanner;

public class Input
{

    public static String getString()
    {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a string: ");
        return scanner.nextLine();
    }

//    public static boolean yesNo()
//    {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter y or n: ");
//        String userInput = scanner.nextLine();
//        return userInput.equalsIgnoreCase("y")
//                | userInput.equalsIgnoreCase("yes");
//        -------------------------------------------
//        else if(userInput.equalsIgnoreCase("n"))
//        {
//            return false;
//        }
//        else
//        {
//            System.out.println("Can you read?");
//            yesNo();
//        }
//        The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.
//    }

//    public static String getInt(int min, int max)
//    {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter num between min & max value: ");
//        int userInput = scanner.nextInt();
//        if(userInput >= min & userInput <= max)
//        {
//            return "You got it";
//        }
//        System.out.println("Try again!");
//        return getInt(min,max);
//    }
    public static int getInt()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    };

//    public static String getDouble(double min, double max)
//    {
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("enter num between min & max value: ");
//    double userInput = scanner.nextDouble();
//    if(userInput >= min & userInput <= max)
//    {
//        return "You got it";
//    }
//    System.out.println("Try again!");
//    return getDouble(min,max);
//}


    public static void main(String[] args)
    {
//        System.out.println("getString() = " + getString());
//        System.out.println("yesNo() = " + yesNo());
//        System.out.println("getInt(5,10) = " + getInt(5, 10));
//        System.out.println("getDouble(1.01,2.01) = " + getDouble(1.01, 2.01));
    }
}
