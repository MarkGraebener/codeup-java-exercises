public class Person
{
    private String name;

    public Person(String name)
    {
        this.name = name;
    }
        public String getName()
        {
//TODO: return the person's name
        return this.name;
        }

        public void setName(String name)
        {
//TODO: change the name field to the passed value
            this.name = name;
        }
        public String sayHello()
        {
//TODO: print a message to the console using the person's name
            return String.format("Hello from %s!", this.name);
        }

    public static void main(String[] args)
    {
//        Person rick = new Person();
//        rick.name = "Rick";
//        System.out.println("rick.getName() = " + rick.getName());
//        System.out.println();
//        rick.name = "Sanchez";
//        System.out.println("rick.name = " + rick.name);
//        System.out.println("rick.sayHello() = " + rick.sayHello());
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
////        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}
