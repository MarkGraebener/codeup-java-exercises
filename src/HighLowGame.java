import java.util.Scanner;

public class HighLowGame
{
    static final long randNum = Math.round(Math.random() * 100);//why a double?long?

    public static void highLow()
    {

        Scanner scanner = new Scanner(System.in);

//        System.out.println(randNum);
        System.out.print("Guess a number from 1 to 100? ");
        int userPick = scanner.nextInt(); // input as int
        if(userPick == randNum)
        {
            System.out.println("WoW! you got it " + randNum + " was it!");
        }
        else if(userPick < randNum)
        {
            System.out.println("Too low");
            highLow();
        }
        else if(userPick > randNum)
        {
            System.out.println("Too high");
            highLow();
        }
    }
    public static void main(String[] args)
    {
        highLow();
    }
}
