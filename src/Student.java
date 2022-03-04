import java.util.ArrayList;

public class Student
{
    public String name;
    public ArrayList<Integer> grades;
    public static int studentCount;

    public Student(String name)
    {
        this.name = name;
        this.grades = new ArrayList<>();
        //setting static count
        studentCount++;
    };

    // returns the student's name
    public String getName() {
        return this.name;
    };

    // adds the given grade to the grades property
    public void addGrade(int grade)
    {
        this.grades.add(grade);
    };

    public void addGrades(ArrayList<Integer> grades)
    {
        this.grades.addAll(grades);

    };

    // returns the average of the students grades
    public double getGradeAverage()
    {

        int sum = 0;
        for(double grade : this.grades)
        {
            sum += grade;
        }
        return (double) sum / grades.size();
    };


    public static void main(String[] args)
    {
        ArrayList<Integer> matthewsGrades = new ArrayList<>();
        ArrayList<Integer> marksGrades = new ArrayList<>();
        marksGrades.add(90);
        marksGrades.add(99);
        marksGrades.add(93);
        marksGrades.add(94);

        Student student1 = new Student("Mark");
        Student student2 = new Student("Matthew");
        student1.addGrade(80);
        student2.addGrade(99);

        student1.addGrades(marksGrades);
        System.out.println("student1.getGradeAverage() = " + student1.getGradeAverage());
        System.out.println("student1.grades = " + student1.grades);
        System.out.println("Student.studentCount = " + Student.studentCount);
    }
}
