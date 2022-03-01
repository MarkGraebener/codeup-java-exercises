import java.util.ArrayList;
import java.util.Arrays;

public class ArraysExercises
{
//    static int[] numbers = {1, 2, 3, 4, 5};
//    static String[] persons = new String[3];

    public static String[] addPerson(String person)
    {
        String[] arr = {"Mark", "Matthew","Mark"};
        int n = arr.length;

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arr));
        arrayList.add(person);
        arr = arrayList.toArray(arr);
        return arr;
    }
    public static void main(String[] args)
    {
//        System.out.println(Arrays.toString(numbers));
//        persons[0] = "Matthew";
//        System.out.println("Arrays.toString(persons) = " + Arrays.toString(persons));
        System.out.println("newPerson(\"Angela\") = " + Arrays.toString(addPerson("Angela")));
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(newArr));

    }
}
