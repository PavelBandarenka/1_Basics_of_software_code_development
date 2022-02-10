package by.epam.basic.cycle;

import java.util.ArrayList;

public class Task_8_occurrencesOfNumbers {

    /*
     *  Даны два числа. Определить цифры,
     *  входящие в запись как первого так и второго числа.
     */

    public static void main(String[] args) {

        int a;
        int b;
        ArrayList<Integer> list;

        a = 1231111222;
        b = 1422251111;
        list = new ArrayList<>();

        findOccurrences(a, b, list);

        System.out.println(list);
    }

    public static void findOccurrences(int a, int b, ArrayList<Integer> list) {
        int tempA = a;
        int tempB = b;

        while (tempA > 0)
            if (tempA % 10 == tempB % 10) {
                tempB /= 10;
                rememberOccurrences(list, tempA % 10);
            } else if (tempB == 0) {
                tempB = b;
                tempA /= 10;
            } else {
                tempB /= 10;
            }
    }

    public static void rememberOccurrences(ArrayList<Integer> list, int a) {
        if (!list.contains(a)) {
            list.add(a);
        }
    }
}
