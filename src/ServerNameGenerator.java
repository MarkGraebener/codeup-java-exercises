public class ServerNameGenerator
{

    static String[] adjectives = {"abrupt", "acidic", "adorable", "adventurous", "aggressive", "agitated", "alert", "aloof", "amiable", "amused", "annoyed", "antsy", "anxious","appalling", "appetizing", "wacky" ,"weary","whimsical","whopping", "wicked", "witty", "wobbly", "wonderful", "worried", "yummy","zany", "zealous"};

    static String[] nouns = {"Actor", "Gold", "Painting", "Advertisement", "Grass", "Parrot", "Afternoon", "Greece", "Pencil", "Airport", "Guitar", "Piano", "Ambulance", "Hair", "Pillow", "Animal", "Hamburger", "Pizza","Answer", "Helicopter", "Planet", "Apple", "Helmet", "Plastic", "Army", "Holiday", "Portugal", "Australia", "Honey", "Potato", "Balloon", "Horse", "Queen"};


    public static void main(String[] args)
    {
        int randInt = (int) Math.floor(Math.random() * (adjectives.length - 1));
        int randInt2 = (int) Math.floor(Math.random() * (nouns.length - 1));
        String randAdj = adjectives[randInt];
        String randNoun = nouns[randInt2];
        System.out.printf("Your name is: %n %s - %s", randAdj,randNoun);
    }
}
