package by.epam.basic.cycle;

public class Task_4_multiplicationOfPowers {

    // Составить программу нахождения произведения квадратов первых двухсот чисел.

    public static void main(String[] args) {
        int count;

        count = 200;

        multiplyDigits(count);
    }

    public static void multiplyDigits(int count) {

        int multiply;
        int lastValueBeforeOverflow;

        multiply = 1;

        for (int i = 1; i <= count; i++) {
            lastValueBeforeOverflow = multiply;
            multiply = multiply * i * i;
            if (checkForOverFlow(multiply, lastValueBeforeOverflow)) {
                break;
            }
        }
    }

    public static boolean checkForOverFlow (int multiply, int lastValueBeforeOverflow){
        if (multiply < 0){
            System.out.println(lastValueBeforeOverflow + " - is the last value before int overflow");
            return true;
        } else return false;
    }
}