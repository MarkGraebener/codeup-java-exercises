package GroceryListApp;


import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class GroceryApp
{
    public static HashMap<String, Integer> myList  = new HashMap<>();
    public static Scanner resultsInput = new Scanner(System.in);
    public static String answer;

    public static void addToList(User name, String item, int Quant)
    {
        groceryList.put(item,Quant);
        System.out.println(name.getGroceryList());

    }
    public static User addUser(String name)
    {
       return new User(name, myList);
    }

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
    public static void appRun()
    {

        String answer2 = resultsInput.nextLine();

        HashMap<String, String> groceryList = new HashMap<>();
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
public static void addingItems()
{
    String item = resultsInput.nextLine();
    String quant = resultsInput.nextLine();
    groceryList.put(item,quant);
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
