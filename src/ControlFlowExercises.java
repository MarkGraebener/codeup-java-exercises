import java.util.Scanner;

public class ControlFlowExercises
{
    public static void main(String[] args)
    {
//while loop from 5 - 15
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

        //do while count by 2s from 0 -100
//        int count = 0;
//        do {
//            System.out.println("Your count is: " + count);
//            count+=2;
//        } while (count <= 100);

        //do while from 100 - 5 by 5s
//        int count = 100;
//        do {
//            System.out.println("Your count is: " + count);
//            count-= 5;
//        } while (count >= 5);
        //do while square 2 till 1,000,000
        // why do you have to use double with math.pow??????????
//        double count = 2;
//        do {
//            System.out.println("Your count is: " + count);
//            count = Math.pow(count, 2);
//        } while (count <= 1000000);

        //for loop refactor
        //2s from 0 - 100
//        for(int i = 0; i <= 100; i+=2) {
//            System.out.println("i is " + i);
//        }
        // from 100 - 5 by 5s
//        for(int i = 100; i >= 5; i-=5) {
//            System.out.println("i is " + i);
//        }
        //square 2 till 1,000,000
//        for(double i = 2; i <= 1000000; i = Math.pow(i, 2)) {
//            System.out.println("i is " + i);
//        }

        //fizz buzz
//        for(int i = 1; i <= 100; i++)
//        {
//            if(i % 3 == 0 & i % 5 == 0)
//            {
//                System.out.println(i + " = FizzBuzz");
//            }
//            else if(i % 5 == 0)
//            {
//                System.out.println(i + " = Buzz");
//            }
//            else if(i % 3 == 0)
//            {
//                System.out.println(i + " = Fizz");
//            }
//            else
//            {
//                System.out.println(i);
//
//            }
//        }
        // user input numerical grade and print letter grade
        //A : 100 - 88
        //B : 87 - 80
        //C : 79 - 67
        //D : 66 - 60
        //F : 59 - 0

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter numerical grade: ");
//        int userInput = scanner.nextInt(); // input as int
//        if(userInput >= 88 & userInput <= 100)
//        {
//            System.out.println("You entered: " + userInput + " You got an A");
//        }
//        else if (userInput >= 80 & userInput <= 87)
//        {
//            System.out.println("You entered: " + userInput + " You got a B");
//        }
//        else if (userInput >= 67 & userInput <= 79)
//        {
//            System.out.println("You entered: " + userInput + " You got a C");
//        }
//        else if (userInput >= 60 & userInput <= 66)
//        {
//            System.out.println("You entered: " + userInput + " You got a D");
//        }
//        else
//       {
//           System.out.println("You entered: " + userInput + " You got an F Ouch");
//       }


        // need help with the tables????????????????
//        Scanner scanner = new Scanner(System.in);
//        String choice = "y";
//        while (choice.equalsIgnoreCase("y"))
//        {
//            System.out.println("Enter an Integer: ");
//            int integerNext = scanner.nextInt(6);
//            System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
//            System.out.println("======" + "  " + "=======" + "  " + "=====");
//            for (int i = 1; i <= integerNext; i++)
//            {
//                int numberSquared = (int) Math.pow(i, 2);
//                int numberCubed = (int) Math.pow(i, 3);
//                String message = "\n" + "|  " + i + "   |  " + numberSquared + "     |  " + numberCubed;
//                System.out.print(message);
//            }
//            System.out.print("\nContinue? (y/n): ");
//            choice = scanner.next();
//            System.out.println();

//        }
    }

}
