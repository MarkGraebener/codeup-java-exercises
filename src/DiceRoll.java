import java.util.Scanner;

class DiceRoll
{
    public static void diceDisplay()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What size dice are we using? ");
        int diceSizeInput = scanner.nextInt(); // input as int
        long dice1 = Math.round(Math.random() * diceSizeInput);//why a double?long?
        long dice2 = Math.round(Math.random() * diceSizeInput);//why a double?long?
        System.out.println("You rolled a: " + dice1 + " & a : " + dice2);
    }
    public static void main(String[] args)
    {
        diceDisplay();
    }
}
