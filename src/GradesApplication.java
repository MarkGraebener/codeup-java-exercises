import java.util.*;

public class GradesApplication
{
    static HashMap<String, Student> students = new HashMap<>();
    public static void setStudents()
    {
        //string for usermane and instance of Student passed into hash maps
        //creating students
        students.put("MarkGraebener", new Student("Mark"));
        students.put("CodingChef", new Student("Matthew"));
        students.put("CyberChef", new Student("Mark"));
        students.put("coolUserName", new Student("Angela"));
        students.put("WackWack", new Student("Josh"));

    }
    public static void setGrades()
    {
        //adding grades into the arraylist
        students.get("MarkGraebener").addGrade(99);
        students.get("MarkGraebener").addGrade(100);
        students.get("MarkGraebener").addGrade(97);
        students.get("CodingChef").addGrade(97);
        students.get("CodingChef").addGrade(96);
        students.get("CodingChef").addGrade(98);
    }
    public static void setStudent(String GHName,String name)
    {
        students.put(GHName, new Student(name));
    }
    public static void setGrade(String GHName, int grade)
    {
        students.get(GHName).addGrade(grade);

    }
    public static void printAllNames()
    {
        System.out.println(students.keySet());
    }
    public static void  printStudentByGHName(String student)
    {
        System.out.println("student = " + students.get(student).getName() + " \nGitHub: " + student + " \nGrade ave: "+ students.get(student).getGradeAverage() + "\nCurrent grades: " + students.get(student).grades);
    }
public static void startApp()
{

    System.out.println();
    System.out.println("Here are the GitHub usernames of our students:");
    System.out.println(students.keySet());
    runApp();

    
}
public static void runApp()
{
    Scanner resultsInput = new Scanner(System.in);
    System.out.println();
    System.out.println("What student would you like to see more information on?");
    String answers;
    String answers2;

    answers = resultsInput.nextLine();
    printStudentByGHName(answers);
    System.out.println("Would you like to see another student?");
    answers2 = resultsInput.nextLine();
    if(Objects.equals(answers2, "y"))
    {
        runApp();
    }
    else
    {
        System.out.println("Goodbye, and have a wonderful day!");
        System.exit(0);
    }
}

    public static void main(String[] args)
    {
        setStudents();
        setGrades();
        setStudent("CodingCoder","Jeff");
        setGrade("MarkGraebener", 99);
//        printAllNames();
//        printStudentByGHName("MarkGraebener");
        startApp();
//        System.out.println("Student.studentCount = " + Student.studentCount);


    }
}