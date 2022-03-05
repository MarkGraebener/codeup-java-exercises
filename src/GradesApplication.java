import java.util.HashMap;

public class GradesApplication
{

//    public void printAll()
//    {
//        for (String student : this)
//        {
//
//        }
//    }

    public static void main(String[] args) {
        //string for usermane and instance of Student passed into hash maps
        HashMap<String, Student> students = new HashMap<>();
        //creating students
        students.put("MarkGraebener", new Student("Mark"));
        students.put("CodingChef", new Student("Matthew"));
        students.put("CyberChef", new Student("Mark"));
        students.put("coolUserName", new Student("Angela"));
        students.put("WackWack", new Student("Josh"));
        //adding grades into the arraylist
        students.get("MarkGraebener").addGrade(99);
        students.get("MarkGraebener").addGrade(100);
        students.get("MarkGraebener").addGrade(97);
        students.get("CodingChef").addGrade(97);
        students.get("CodingChef").addGrade(96);
        students.get("CodingChef").addGrade(98);

        //printing grades in from username key
        System.out.println(students.get("MarkGraebener").grades);
        System.out.println(students.get("MarkGraebener").getGradeAverage());
        //keySet returns all keys
        System.out.println(students.keySet());




    }
}