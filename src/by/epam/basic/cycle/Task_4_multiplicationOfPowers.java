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
        int overflow;

        multiply = 1;

        for (int i = 1; i <= count; i++) {
            overflow = multiply;
            multiply = multiply * i * i;
            if (multiply < 0) {
                System.out.println(overflow + " - is the last value before int overflow");
                break;
            }
        }
    }
}