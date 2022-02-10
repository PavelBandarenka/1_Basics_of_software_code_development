package by.epam.basic.branching;

public class Task_2_maxMin {

    //  Найти max{min(a, b), min(c, d)}.

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;
        int maxValueFromABCD;

        a = 7;
        b = 6;
        c = 5;
        d = 4;

        maxValueFromABCD = findMaxValue(a, b, c, d);
        System.out.println("Max = " + maxValueFromABCD);
    }

    public static int findMaxValue(int a, int b, int c, int d) {
        int minValueAB;
        int minValueCD;

        minValueAB = Math.min(a, b);
        minValueCD = Math.min(c, d);
        return Math.max(minValueAB, minValueCD);
    }
}
