import java.util.Scanner;

public class ConsoleExercises
{
    public static void main(String[] args)
    {
        double pi = Math.PI;
//        System.out.format("%.2f%n", pi);

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter integer: ");
//        int userInput = scanner.nextInt(); // input as int
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        System.out.print("Enter float: ");
//        float userInput = scanner.nextFloat(); // input as float
//        System.out.println("You entered: --> \"" + userInput + "\" <--");


        // why decimals no work in user input????????????????
//        System.out.print("Enter long: ");
//        long userInput = scanner.nextLong(); // input as long
//        System.out.println("You entered: --> \"" + userInput + "\" <--");


//        System.out.print("Enter 3 words: ");
//
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//
//        System.out.println("You entered: --> " + userInput1 + " " + userInput2 + " " + userInput3 + " <--");

//        System.out.print("Enter 3 words: ");
//
//        String userInput1 = scanner.nextLine();
//
//        System.out.println("You entered: --> " + userInput1 + " <--");

        System.out.print("Enter length: ");
        int length = scanner.nextInt();
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        int perimeter = (length * 2) + (width * 2);
        int area = length * width;
        System.out.println("The perimeter is: " + perimeter + "\nThe area is: " + area);

    }
}
