public class ControlFlowExercises
{
    public static void main(String[] args)
    {
//while loop from 5 - 15
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

        //do while count by 2s from 0 -100
//        int count = 0;
//        do {
//            System.out.println("Your count is: " + count);
//            count+=2;
//        } while (count <= 100);

        //do while from 100 - 5 by 5s
//        int count = 100;
//        do {
//            System.out.println("Your count is: " + count);
//            count-= 5;
//        } while (count >= 5);
        //do while square 2 till 1,000,000
        // why do you have to use double with math.pow??????????
        double count = 2;
        do {
            System.out.println("Your count is: " + count);
            count = Math.pow(count, 2);
        } while (count <= 1000000);
    }
}
