package GroceryListApp;

import java.util.HashMap;

public class User
{

    public String name;
    public HashMap<String, Integer> groceryList;
//    public ArrayList<String> groceryList;
    public int id;
    public static int userCount;

    public User(String name, HashMap<String, Integer> groceryList)
    {
        this.name = name;
        this.groceryList = groceryList;

        userCount++;
        this.id = userCount;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Integer> getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(HashMap<String, Integer> groceryList) {
        this.groceryList = groceryList;
    }

    public static void main(String[] args)
    {
//        HashMap<String, Integer> MarksList = new HashMap<>();
//        MarksList.put("Pineapple", 22);
//        User Mark = new User("Mark", MarksList);
//        System.out.println("Mark = " + Mark.id);
//        User Matthew = new User("Matthew", MarksList);
//        User Angela = new User("Angela", MarksList);
//
//        System.out.println("Matthew = " + Matthew.getGroceryList());
//        System.out.println("Angela.id = " + Angela.id);
    }
}

