import java.util.Scanner;

public class Bob
{
    public static void main(String[] args)
    {
        Scanner BobsBurger = new Scanner(System.in);

        System.out.print("sup bruh?: ");
        String Talking;

        Talking = BobsBurger.nextLine();
        if (Talking.contains("?")) {
            System.out.println("Sure thing broski");
        } else if (Talking.endsWith("!")) {
            System.out.println("Take it down a few notches friend..");
        } else if (Talking.equals("")) {
            System.out.println("Fine, We do not need to talk. Just hang");
        } else {
            System.out.println("I don't have a comment on that");
        }
// how can i have it run the question again???????????????????????????✅
    }
}
