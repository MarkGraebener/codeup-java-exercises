package GroceryListApp;


import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class GroceryApp
{
    // creating global hash map . this app is for only one user to use?????????
    // all share the hash map but i dont like this
    public static HashMap<String, Integer> myList  = new HashMap<>();
    public static Scanner resultsInput = new Scanner(System.in);
    public static String answer;

    // not needed right now
    public static void addToList(User name, String item, int Quant)
    {
        myList.put(item,Quant);
        System.out.println(name.getGroceryList());

    }
    public static User addUser(String name)
    {
       return new User(name, myList);
    }

    // starts the app
    public static void  runAppStart()
    {
        System.out.println("Thank you for your purchase, who am i speaking with?");

        answer = resultsInput.nextLine();
        addUser(answer);
        System.out.println("Welcome " + answer + ", should we start your list?");
        appRun();
//        HashMap<String, Integer> resultsInput.nextLine() = new HashMap<>();
//        HashMap<String, Integer> name  = new HashMap<>();

    }
    //runs the conditional
    public static void appRun()
    {
// only runs once even when called again bc answer2 changes to nextline() is alwas false
        //need to put question above and ask for another var
        String answer2 = resultsInput.nextLine();


        if(Objects.equals(answer2,"y"))
        {
            System.out.println("What would you like to add? Item and quantity: ");
            addingItems();
        }
        else
        {
            System.exit(0);
        }

    }
    // adding a list item and quantity to the hash map
    public static void addingItems()
    {
        String item = resultsInput.nextLine();
        int quant = resultsInput.nextInt();
        myList.put(item, quant);
        // how can i get the user info ??????
        System.out.println(addUser(answer).getGroceryList());
        appRun();
    }

    public static void main(String[] args)
    {
//        HashMap<String, Integer> MarksList = new HashMap<>();
//
//        MarksList.put("Pineapple", 2);
//        MarksList.put("Rib-eye", 4);
//        MarksList.put("pe-made salad", 4);
//        System.out.println("MarksList = " + MarksList);
//        User Mark = addUser("Mark");
//        addToList( Mark,"OJ",1);
runAppStart();

    }
}
