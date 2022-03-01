import java.util.Arrays;
//why cant it be a public class to run this?
class ArraysExercise
{
    int[] numbers = {1, 2, 3, 4, 5};
    String[] persons = new String[3];
    persons[0] = "mike";
    persons[1] = "matthew";
    persons[2] = "mark";

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbers));
    }
}
