package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArraysExercise {
    public static void main(String[] args) {

//        int maxSize = 20;
//        float[] numbers = new float[maxSize];
//
//        for (int i = 0; i < maxSize; i++) {
//            numbers[i] = (float) i;
//        }

//        DoubleList(numbers);
//

//        ArrayList<Float> numbers = new ArrayList<Float>();
//        for (int i = 0; i < maxSize; i++) {
//            numbers.add((float) i);
//        }
//        numbers = DoubleList(numbers);

//        int[] numbers = new int[] { 1,1,2,3,5,8};
//        for (int number :
//                numbers) {
//            System.out.printf("Number: %d\n", number);
//        }

        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> roster = new HashMap<>();
        String studentName;
        Integer studentID = 1;

        System.out.println("Enter students names (Press only ENTER when prompted for another student to finish).");
        System.out.print("Student: ");
        studentName = scanner.nextLine();
        do {

            if (!studentName.equals("")) {
                roster.put(studentID, studentName);
                studentID = new Integer(studentID.intValue() + 1);
            }

            System.out.print("Student: ");
            studentName = scanner.nextLine();
        } while (!studentName.equals(""));

        if (!roster.isEmpty()) {
            System.out.println("Roster");
            for (Map.Entry<Integer, String> student :
                    roster.entrySet()) {
                System.out.println(student.getKey() + " : " + student.getValue());
            }
        } else {
            System.out.println("Empty roster");
        }
    }

    private static void DoubleList(float[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] *= 2;
        }
    }

    private static ArrayList<Float> DoubleList(ArrayList<Float> list) {
        ArrayList<Float> newList = new ArrayList<Float>();

        for (Float number :
                list) {
            newList.add(number * 2);
        }

        return newList;
    }
}
